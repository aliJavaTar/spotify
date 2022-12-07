package com.spotify.inventory.person.infrastructure;

import com.spotify.inventory.person.domin.User;
import com.spotify.inventory.person.domin.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DefaultUserRepository implements UserRepository {
    private final MysqlUserRepository mysqlUserRepository;

    public DefaultUserRepository(MysqlUserRepository mysqlUserRepository) {
        this.mysqlUserRepository = mysqlUserRepository;
    }
    @Override
    public Optional<User> addUser(User user) {
        return Optional.of(mysqlUserRepository.save(user));
    }
}
