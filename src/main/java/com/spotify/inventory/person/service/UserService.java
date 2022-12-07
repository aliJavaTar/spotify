package com.spotify.inventory.person.service;

import com.spotify.inventory.person.domin.User;

import java.util.InvalidPropertiesFormatException;

public interface UserService {
    User addUsers(User user) throws InvalidPropertiesFormatException;
}
