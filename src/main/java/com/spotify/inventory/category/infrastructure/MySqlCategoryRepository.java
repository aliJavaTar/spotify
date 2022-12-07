package com.spotify.inventory.category.infrastructure;

import com.spotify.inventory.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlCategoryRepository extends JpaRepository<Category, Long> {
}
