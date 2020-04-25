package org.tech.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.tech.world.exception.DatabaseDownException;
import org.tech.world.service.CountryService;

@SpringBootTest
class WorldApplicationTests {
    
    @Autowired
    private CountryService countryService;
    
    @Test
    void contextLoads() {
    }
    
    @Test
    void getCountryInformation_WhenDatabaseDown_DatabaseDownExceptionThrown() {
        Assertions.assertThrows(DatabaseDownException.class, () -> countryService.getCountryInformation("BHR"));
    }
    
}
