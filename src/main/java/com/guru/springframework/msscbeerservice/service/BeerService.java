package com.guru.springframework.msscbeerservice.service;

import com.guru.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto  getById(UUID beerId);

    BeerDto  saveNewBeer(BeerDto beerDto);

    BeerDto  updateBeer(UUID beerId, BeerDto beerDto);
}
