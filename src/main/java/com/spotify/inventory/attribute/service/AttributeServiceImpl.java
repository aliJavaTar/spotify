package com.spotify.inventory.attribute.service;

import com.spotify.inventory.attribute.domain.Attribute;
import com.spotify.inventory.attribute.infrastructure.MysqlAttributeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements AttributeService {
    private final MysqlAttributeRepository attributeRepository;

    public AttributeServiceImpl(MysqlAttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }


    @Override
    public Attribute createAttribute(Attribute attribute) {
        return attributeRepository.save(attribute);
    }
}
