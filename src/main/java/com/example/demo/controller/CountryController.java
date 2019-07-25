package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @GetMapping(value = "/{mnemonic}")
    public Country findCountryByMnemonic(@PathVariable String mnemonic) {
        return countryRepository.findCountryByMnemonic(mnemonic);
    }

    @PostMapping
    public Country save(@RequestBody Country country) {
        return countryRepository.save(country);
    }

}
