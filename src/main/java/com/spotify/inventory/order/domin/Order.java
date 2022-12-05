package com.spotify.inventory.order.domin;

import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.person.domin.User;
import com.spotify.inventory.product.domin.Product;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order extends BaseEntity<Long> {

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "order_product",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> product;

    private int code;

    public Order() {
    }

    public Order(User user, List<Product> product, int code) {
        this.user = user;
        this.product = product;
        this.code = code;
    }


    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
