package org.tech.world.service;

import org.springframework.http.ResponseEntity;

public interface CountryService {
    
    ResponseEntity<?> getCountryInformation(String countryCode);
    
}
