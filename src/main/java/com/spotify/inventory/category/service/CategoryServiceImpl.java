package com.spotify.inventory.category.service;

import com.spotify.inventory.category.domain.Category;
import com.spotify.inventory.category.infrastructure.DefaultCategoryRepository;

public class CategoryServiceImpl implements CategoryService {
    private final DefaultCategoryRepository categoryRepository;

    public CategoryServiceImpl(DefaultCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category).orElseThrow(() -> new RuntimeException(""));
    }
}
