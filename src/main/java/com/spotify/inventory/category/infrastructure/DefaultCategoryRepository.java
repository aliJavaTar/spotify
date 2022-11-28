package com.spotify.inventory.category.infrastructure;

import com.spotify.inventory.category.domain.Category;
import com.spotify.inventory.category.domain.CategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultCategoryRepository extends CategoryRepository, JpaRepository<Category, Long> {
}
