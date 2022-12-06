package com.spotify.inventory.attribute.domain;

import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.category.domain.Category;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "attribute")
public class Attribute extends BaseEntity<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String value;

    @ManyToMany
    @JoinTable(
            name = "attribute_categoty",
            joinColumns = {@JoinColumn(name = "attribute_id")},
            inverseJoinColumns = {@JoinColumn(name = "categoty_id")})

    private List<Category> categories;

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
