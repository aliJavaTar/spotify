package com.spotify.inventory.attribute.domain;

import java.util.Optional;

public interface AttributeRepository {
    Optional<Attribute> save(Attribute attribute);
}
