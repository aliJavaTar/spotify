package com.spotify.inventory.person.domin;

import java.util.Optional;

public interface UserRepository {
    Optional<User> addUser(User user);
}