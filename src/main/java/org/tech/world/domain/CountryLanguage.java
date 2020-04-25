package org.tech.world.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "country_language")
public class CountryLanguage implements Serializable {
    @Id
    @Column(name = "country_code", length = 3)
    @NotNull
    private String countryCode;
    @Id
    @Column(columnDefinition = "TEXT")
    @NotNull
    private String language;
    @Basic
    @Column(name = "is_official")
    @NotNull
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
