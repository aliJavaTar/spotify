package com.spotify.inventory.category.domain;


import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Entity;

import java.sql.Timestamp;


@Entity

public class Category extends BaseEntity<Long> {
    private String name;
    private Long parentId;

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
}
