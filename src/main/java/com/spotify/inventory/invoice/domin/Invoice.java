package com.spotify.inventory.invoice.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.sql.Timestamp;

@Entity
public class Invoice extends BaseEntity<Long> {
    @Column(nullable = false)
    private int expiredAt;
    @Column(nullable = false)
    private String description;

    @Column(name = "user_id", nullable = false)
    private Long userID;

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
}
