package com.spotify.inventory.storeroom.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class Storeroom extends BaseEntity<Long> {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }
}
