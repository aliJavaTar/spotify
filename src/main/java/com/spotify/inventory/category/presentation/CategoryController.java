package com.spotify.inventory.category.presentation;

import com.spotify.inventory.category.domain.Category;
import com.spotify.inventory.category.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("api-v1")
    public ResponseEntity<Category> addCategory(Category category) {
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);
    }
}
