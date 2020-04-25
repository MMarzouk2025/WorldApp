package org.tech.world.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.world.service.CountryService;

@RestController
@RequestMapping("/")
public class CountryController {
    
    private final CountryService countryService;
    
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    
    @GetMapping("/{country-code}")
    public ResponseEntity<?> getCountryInformation(@PathVariable("country-code") String code) {
        return countryService.getCountryInformation(code);
    }
    
}
