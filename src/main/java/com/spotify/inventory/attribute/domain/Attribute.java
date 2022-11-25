package com.spotify.inventory.attribute.domain;

import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Attribute extends BaseEntity<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String value;

    public Attribute() {
    }

    private Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Attribute createAttribute(String name, String value) {
        if (value.length() > 3 && name.length() > 3)
            return new Attribute(name, value);
        throw new RuntimeException("invalid value");
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
