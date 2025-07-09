package com.example.countryservice.repository;

import com.example.countryservice.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Find countries where name contains a keyword (for partial name search)
    List<Country> findByCoNameContainingIgnoreCase(String keyword);
}
