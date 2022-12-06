package com.spotify.inventory.attribute.domain;

import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.category.domain.Category;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

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

    public Attribute() {}

    public Attribute(Timestamp createAt, Timestamp updateAt, String name, String value) {
        super(createAt, updateAt);
        this.name = name;
        this.value = value;
    }

    private Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
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

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attribute attribute = (Attribute) o;
        return name.equals(attribute.name) &&
                value.equals(attribute.value) &&
                categories.equals(attribute.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, categories);
    }
}
