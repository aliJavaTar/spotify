package com.spotify.inventory.attribute.infrastructure;

import com.spotify.inventory.attribute.domain.Attribute;
import com.spotify.inventory.attribute.domain.AttributeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MysqlAttributeRepository extends JpaRepository<Attribute, Long> {

}
