package org.tech.world.mapper;

import org.tech.world.domain.Country;
import org.tech.world.payload.CountryApiResponse;

public class CountryResponseMapper {
    
    public static CountryApiResponse fromCountryToCountryResponse(Country country, String language) {
        CountryApiResponse countryApiResponse = new CountryApiResponse();
        countryApiResponse.setName(country.getCountryName());
        countryApiResponse.setContinent(country.getContinent());
        countryApiResponse.setPopulation(country.getPopulation());
        countryApiResponse.setLife_expectancy(country.getLifeExpectancy());
        countryApiResponse.setCountry_language(language);
        
        return countryApiResponse;
    }
    
}
