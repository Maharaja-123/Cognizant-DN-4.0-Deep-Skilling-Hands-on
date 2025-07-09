package com.example.countryservice.service;

import com.example.countryservice.entity.Country;
import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> getCountryByCode(String code);
    Country addCountry(Country country);
    Country updateCountry(Country country);
    void deleteCountry(String code);
    List<Country> searchCountriesByName(String keyword);
}
