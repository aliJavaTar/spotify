package com.spotify.inventory.attribute.domain;

import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "attribute")  //todo name
public class Attribute extends BaseEntity<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String value;

    //todo attribute many to many





    public Attribute() {
    }

    public Attribute(Timestamp createAt, Timestamp updateAt, String name, String value) {
        super(createAt, updateAt);
        this.name = name;
        this.value = value;
    }

    private Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }



    public static Attribute createAttribute(String name, String value) {
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
