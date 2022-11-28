package com.spotify.inventory.attribute.infrastructure.impl;

import com.spotify.inventory.attribute.infrastructure.AttributeService;
import com.spotify.inventory.attribute.infrastructure.DefaultAttributeRepository;

public class DefaultAttributeService implements AttributeService {
    private final DefaultAttributeRepository repository;

    public DefaultAttributeService(DefaultAttributeRepository repository) {
        this.repository = repository;
    }
}
