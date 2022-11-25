package com.spotify.inventory.person.domin;

import com.spotify.inventory.basedomin.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;

import java.sql.Timestamp;
import java.util.InvalidPropertiesFormatException;
import java.util.regex.Pattern;

@Entity
public class User extends BaseEntity<Long> {
    @Column(nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private String username;
    @Min(8)
    @Column(nullable = false)
    private String password;
    @Min(12)
    private String phoneNumber;
    @Column(name = "is_admin", nullable = false)
    private boolean isAdmin;

    public User() {

    }

    public User(Timestamp createAt, Timestamp updateAt) {
        super(createAt, updateAt);
    }

    private User(String name, String email, String username, String password,
                 boolean isAdmin, Timestamp createAt, Timestamp updateAt) {
        super(createAt, updateAt);
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public static User createPerson(String name, String email, String username,
                             String password, boolean isAdmin, Timestamp createAt, Timestamp updateAt)
            throws InvalidPropertiesFormatException {
        if (isValidEmail(email) || isValidPassword(password) || isValidUsername(username))
            return new User(name, email, username, password, isAdmin, createAt, updateAt);
        throw new InvalidPropertiesFormatException("invalid information");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    private static boolean isValidPassword(String password) {
        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";
        return Pattern.matches(regex, password);
    }

    private static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z]([._-](?![._-])|[a-zA-Z0-9]){3,16}[a-zA-Z0-9]$";
        return Pattern.matches(regex, username);
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regex, email);
    }

}
