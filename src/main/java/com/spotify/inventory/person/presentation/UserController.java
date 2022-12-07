package com.spotify.inventory.person.presentation;

import com.spotify.inventory.person.domin.User;
import com.spotify.inventory.person.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.InvalidPropertiesFormatException;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api-v1-users")
    public ResponseEntity<User> addUsers(@RequestBody @Valid User user) {
        try {
            return new ResponseEntity<>(userService.addUsers(user), HttpStatus.CREATED);
        } catch (InvalidPropertiesFormatException e) {
            return new ResponseEntity<>(new User(), HttpStatus.BAD_REQUEST);
        }
    }
}
