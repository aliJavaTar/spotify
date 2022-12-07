package com.spotify.inventory.person.infrastructure;

import com.spotify.inventory.person.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlUserRepository extends JpaRepository<User, Long> {
}
