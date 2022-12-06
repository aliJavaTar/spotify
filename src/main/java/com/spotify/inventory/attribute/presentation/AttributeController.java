package com.spotify.inventory.attribute.presentation;

import com.spotify.inventory.attribute.domain.Attribute;
import com.spotify.inventory.attribute.service.AttributeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attributes")
public class AttributeController {
    private final AttributeService service;

    public AttributeController(AttributeService attributeService) {
        this.service = attributeService;
    }

    @PostMapping("/api-v1")
    public ResponseEntity<Attribute> createAttribute(@RequestBody @Valid Attribute attribute) {
        return new ResponseEntity<>(service.createAttribute(attribute), HttpStatus.CREATED);
    }
}
