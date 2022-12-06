package com.spotify.inventory.invoice.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.order.domin.Order;
import com.spotify.inventory.person.domin.User;
import com.spotify.inventory.product.domin.Product;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class Invoice extends BaseEntity<Long> {

    @Column(nullable = false)
    private int expiredAt;

    @Column(nullable = false)
    private String description;


    @OneToOne
    private Order order;


    public Invoice() {
    }

    private Invoice(Timestamp createAt, Timestamp updateAt, int expiredAt, String description) {
        super(createAt, updateAt);
        this.expiredAt = expiredAt;
        this.description = description;
    }

    public static Invoice createInvoice(Timestamp createAt, Timestamp updateAt, int expiredAt, String description) {
        return new Invoice(createAt, updateAt, expiredAt, description);
    }

    public int getExpiredAt() {
        return expiredAt;
    }

    public String getDescription() {
        return description;
    }

    public Order getOrder() {
        return order;
    }

    public void setExpiredAt(int expiredAt) {
        this.expiredAt = expiredAt;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
