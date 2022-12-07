package com.spotify.inventory.product.presentation;

import com.spotify.inventory.product.domin.Product;
import com.spotify.inventory.product.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("api-v1-product")
    public ResponseEntity<Product> save(@RequestBody @Valid Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }
}
