package org.tech.world.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tech.world.domain.Country;

public interface CountryDAO extends JpaRepository<Country, String> {
}
