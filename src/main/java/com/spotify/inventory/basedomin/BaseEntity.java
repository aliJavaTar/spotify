package com.spotify.inventory.basedomin;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@MappedSuperclass
public class BaseEntity<ID extends Serializable> {
    @Id
    private ID id;
    private Timestamp createAt;
    private Timestamp updateAt;

    public BaseEntity() {
    }

    public BaseEntity(Timestamp createAt, Timestamp updateAt) {
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public BaseEntity(ID id, Timestamp createAt, Timestamp updateAt) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public ID getId() {
        return id;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }
}
