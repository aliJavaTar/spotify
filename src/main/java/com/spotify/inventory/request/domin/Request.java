package com.spotify.inventory.request.domin;


import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.request.enumeration.Type;
import jakarta.persistence.Entity;

@Entity

public class Request extends BaseEntity<Long> {
    private Type type;
}
