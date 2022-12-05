package com.spotify.inventory.role.domin;

import com.spotify.inventory.basedomin.BaseEntity;
import com.spotify.inventory.person.domin.User;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Role extends BaseEntity<Long> {

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roles_users",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private Set<User> users;
}
