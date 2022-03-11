package com.scaffold.prototipo.models;

public class User {
    private String name;
    private String username;
    private String email;
    private String phone;
    private String password;
    private boolean enable;

    public User(String name, String username, String email, String phone, String password, boolean enable) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.enable = enable;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", enable=" + enable +
                '}';
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    //role
}
