package com.spotify.inventory.category.domain;


import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.product.domin.Product;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Table(name = "categoryes") //todo column name
public class Category extends BaseEntity<Long> {
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;


    public Category() {
    }

    public Category(String name, Category parent) {
        this.name = name;
        this.parent = parent;
    }

    public Category(Timestamp createAt, Timestamp updateAt, String name, Category parent) {
        super(createAt, updateAt);
        this.name = name;
        this.parent=parent;
    }

    public String getName() {
        return name;
    }

    public Category getParent() {
        return parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }
}
