package org.tech.world.service.implementation;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;
import org.tech.world.domain.Country;
import org.tech.world.domain.CountryLanguage;
import org.tech.world.exception.CountryCodeNotFoundException;
import org.tech.world.exception.DatabaseDownException;
import org.tech.world.mapper.CountryResponseMapper;
import org.tech.world.payload.CountryApiResponse;
import org.tech.world.repository.CountryDAO;
import org.tech.world.service.CountryService;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    
    private final CountryDAO countryDAO;
    
    public CountryServiceImpl(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }
    
    @Override
    public ResponseEntity<?> getCountryInformation(String countryCode) {
        Country country = getCountryByCode(countryCode);
        Optional<String> countryLanguageOptional = country.getCountryLanguages().stream()
                .filter(CountryLanguage::isOfficial)
                .map(CountryLanguage::getLanguage)
                .findFirst();
        String language = countryLanguageOptional.orElse("");
        CountryApiResponse response = CountryResponseMapper.fromCountryToCountryResponse(country, language);
        return ResponseEntity.ok(response);
    }
    
    private Country getCountryByCode(String countryCode) {
        Optional<Country> countryOptional;
        try {
            countryOptional = countryDAO.findById(countryCode);
        } catch (CannotCreateTransactionException ex) {
            throw new DatabaseDownException();
        }
        
        Country country;
        
        if (countryOptional.isPresent()) {
            country = countryOptional.get();
        } else {
            throw new CountryCodeNotFoundException();
        }
        
        return country;
    }
    
}
