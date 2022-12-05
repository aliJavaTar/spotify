package com.spotify.inventory.product.domin;

import com.spotify.inventory.attribute.domain.Attribute;
import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.category.domain.Category;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
public class Product extends BaseEntity<Long> {
    private String name;
    private BigInteger price;
    private String description;

    private Long uniqueCode;

    @ManyToOne
    @JoinColumn(name = "category_Id")
    private Category category;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "attribute_product",
            joinColumns = {@JoinColumn(name = "attribute_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})

    private List<Attribute> attribute;

    public Product() {
    }


    private Product(String name, BigInteger price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;

    }

    public static Product createProduct(String name, BigInteger price, String description, Category category) {
        if (name.length() > 3)
            return new Product(name, price, description, category);
        throw new RuntimeException("invalid value");
    }

    public String getName() {
        return name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


    public Category getCategory() {
        return category;
    }

    public List<Attribute> getAttribute() {
        return attribute;
    }
}
