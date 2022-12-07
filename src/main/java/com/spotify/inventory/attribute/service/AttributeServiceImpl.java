package com.spotify.inventory.attribute.service;

import com.spotify.inventory.attribute.domain.Attribute;
import com.spotify.inventory.attribute.domain.AttributeRepository;
import com.spotify.inventory.attribute.infrastructure.DefaultAttributeRepository;
import com.spotify.inventory.attribute.infrastructure.MysqlAttributeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements AttributeService {
    private final DefaultAttributeRepository attributeRepository;

    public AttributeServiceImpl(DefaultAttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }


    @Override
    public Attribute createAttribute(Attribute attribute) {
        return attributeRepository.save(Attribute.createAttribute(attribute.getName(), attribute.getValue()))
                .orElseThrow(() -> new RuntimeException(""));
    }
}
