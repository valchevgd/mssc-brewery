package com.valchevgd.msscbrewery.services;

import com.valchevgd.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
