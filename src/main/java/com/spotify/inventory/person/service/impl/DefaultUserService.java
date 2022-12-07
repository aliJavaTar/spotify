package com.spotify.inventory.person.service.impl;

import com.spotify.inventory.person.domin.User;
import com.spotify.inventory.person.infrastructure.DefaultUserRepository;
import com.spotify.inventory.person.service.UserService;
import org.springframework.stereotype.Service;

import java.util.InvalidPropertiesFormatException;

@Service
public class DefaultUserService implements UserService {
    private final DefaultUserRepository defaultUserRepository;

    public DefaultUserService(DefaultUserRepository defaultUserRepository) {
        this.defaultUserRepository = defaultUserRepository;
    }

    @Override
    public User addUsers(User user) throws InvalidPropertiesFormatException {
        return defaultUserRepository.addUser(User.createPerson(user.getName(), user.getEmail(), user.getUsername(),
                        user.getPassword(), user.isAdmin(), user.getCreateAt(), user.getUpdateAt()))
                .orElseThrow(() -> new RuntimeException("can't add user"));
    }
}
