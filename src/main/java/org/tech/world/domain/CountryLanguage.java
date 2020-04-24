package org.tech.world.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_language")
public class CountryLanguage {
    @Id
    @Column(name = "country_code")
    private String countryCode;
    @Column(columnDefinition = "TEXT")
    private String language;
    @Column(name = "is_official")
    private boolean isOfficial;
    
    public String getCountryCode() {
        return countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public boolean isOfficial() {
        return isOfficial;
    }
    
    public void setOfficial(boolean official) {
        isOfficial = official;
    }
}
