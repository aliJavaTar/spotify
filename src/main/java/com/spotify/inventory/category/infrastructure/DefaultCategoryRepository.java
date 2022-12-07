package com.spotify.inventory.category.infrastructure;

import com.spotify.inventory.category.domain.Category;
import com.spotify.inventory.category.domain.CategoryRepository;

import java.util.Optional;

public class DefaultCategoryRepository implements CategoryRepository {
    private final MySqlCategoryRepository categoryRepository;

    public DefaultCategoryRepository(MySqlCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }



    @Override
    public Optional<Category> save(Category category) {
        return Optional.of(categoryRepository.save(category));
    }
}
