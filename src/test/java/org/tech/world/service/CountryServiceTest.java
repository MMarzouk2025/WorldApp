package org.tech.world.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.tech.world.exception.CountryCodeNotFoundException;
import org.tech.world.repository.CountryDAO;
import org.tech.world.service.implementation.CountryServiceImpl;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class CountryServiceTest {
    @Mock
    private CountryDAO countryDAO;
    
    @InjectMocks
    private CountryServiceImpl countryService;
    
    @BeforeEach
    void setup() {
        Mockito.when(countryDAO.findById("BHC")).thenReturn(Optional.empty());
    }
    
    @Test
    void getCountryInformation_NonExistentCountryCode_CountryCodeNotFoundExceptionThrown() {
        Assertions.assertThrows(CountryCodeNotFoundException.class, () -> countryService.getCountryInformation("BHC"));
    }
    
}