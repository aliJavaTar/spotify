package com.spotify.inventory.request.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.request.enumeration.Type;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.sql.Timestamp;

@Entity

public class Request extends BaseEntity<Long> {
    private Type type;
    @Column(name = "user_id", nullable = false)
    private Long userID;

    public Request() {
    }

    public Request(Timestamp createAt, Timestamp updateAt, Type type, Long userID) {
        super(createAt, updateAt);
        this.type = type;
        this.userID = userID;
    }

    public Type getType() {
        return type;
    }

    public Long getUserID() {
        return userID;
    }
}
