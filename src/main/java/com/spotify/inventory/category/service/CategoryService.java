package com.spotify.inventory.category.service;

import com.spotify.inventory.category.domain.Category;

import java.util.Optional;

public interface CategoryService {
    Category save(Category category);
}
