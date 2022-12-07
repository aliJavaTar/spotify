package com.spotify.inventory.attribute.infrastructure;

import com.spotify.inventory.attribute.domain.Attribute;
import com.spotify.inventory.attribute.domain.AttributeRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DefaultAttributeRepository implements AttributeRepository {

    private final MysqlAttributeRepository mysqlAttributeRepository;

    public DefaultAttributeRepository(MysqlAttributeRepository mysqlAttributeRepository) {
        this.mysqlAttributeRepository = mysqlAttributeRepository;
    }

    @Override
    public Optional<Attribute> save(Attribute attribute) {
        return Optional.of(mysqlAttributeRepository.save(attribute));
    }
}
