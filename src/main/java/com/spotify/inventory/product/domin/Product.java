package com.spotify.inventory.product.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Entity;

import java.math.BigInteger;


@Entity
public class Product extends BaseEntity<Long> {
    private String name;
    private BigInteger price;
    private String description;

    public Product() {
    }

    private Product(String name, BigInteger price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public static Product createProduct(String name, BigInteger price, String description) {
        if (name.length() > 3)
            return new Product(name, price, description);
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


}
