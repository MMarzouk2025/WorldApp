package org.tech.world.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country implements Serializable {
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
    @OneToMany
    @JoinColumn(name = "country_code", referencedColumnName = "code")
    private Set<CountryLanguage> countryLanguages;
    
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
    
    public Set<CountryLanguage> getCountryLanguages() {
        return countryLanguages;
    }
    
    public void setCountryLanguages(Set<CountryLanguage> countryLanguages) {
        this.countryLanguages = countryLanguages;
    }
    
}

