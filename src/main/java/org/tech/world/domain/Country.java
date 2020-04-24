package org.tech.world.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "code")
    private String countryCode;
    @Column(name = "name", columnDefinition = "TEXT")
    @NotNull
    private String countryName;
    @Column(name = "continent", columnDefinition = "TEXT")
    @NotNull
    private String continent;
    @Column(name = "population")
    @NotNull
    private int population;
    @Column(name = "life_expectancy")
    private float lifeExpectancy;
    @OneToOne(mappedBy = "country_code")
    private CountryLanguage countryLanguage;
    
    public String getCountryCode() {
        return countryCode;
    }
    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    public String getCountryName() {
        return countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    public String getContinent() {
        return continent;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }
    
    public float getLifeExpectancy() {
        return lifeExpectancy;
    }
    
    public void setLifeExpectancy(float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    
    public CountryLanguage getCountryLanguage() {
        return countryLanguage;
    }
    
    public void setCountryLanguage(CountryLanguage countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}

