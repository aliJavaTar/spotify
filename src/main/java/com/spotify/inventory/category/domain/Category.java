package com.spotify.inventory.category.domain;


import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.product.domin.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.sql.Timestamp;
import java.util.List;


@Entity

public class Category extends BaseEntity<Long> {
    private String name;
    @Column(nullable = false, columnDefinition = "int default 0")
    private Long parentId;

    @OneToMany(mappedBy = "parentId")
    private List<Category> categories;

    @OneToMany(mappedBy = "categoryId")
    private List<Product> products;


    public Category() {
    }

    public Category(String name, Long parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public Category(Timestamp createAt, Timestamp updateAt, String name, Long parentId) {
        super(createAt, updateAt);
        this.name = name;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public Long getParentId() {
        return parentId;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public List<Product> getProducts() {
        return products;
    }
}
