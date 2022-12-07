package com.spotify.inventory.category.domain;

import java.util.Optional;

public interface CategoryRepository {


    Optional<Category> save(Category category);
}
