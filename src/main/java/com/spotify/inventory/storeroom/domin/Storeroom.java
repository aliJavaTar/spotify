package com.spotify.inventory.storeroom.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.product.domin.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Storeroom extends BaseEntity<Long> {

//    private Location location;

    private int quantity;

    @ManyToMany
    @JoinTable(
            name = "store_room",
            joinColumns = {@JoinColumn(name = "store_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> productList;

    public int getQuantity() {
        return quantity;
    }
}
