package com.example.user;


/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
public enum Type {

    ADMIN("ROLE_ADMIN", "Admin"),
    USER("ROLE_USER", "User");

    private final String display;
    private final String role;
    Type(String role, String display) {
        this.role = role;
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String getRole() {
        return role;
    }
}
