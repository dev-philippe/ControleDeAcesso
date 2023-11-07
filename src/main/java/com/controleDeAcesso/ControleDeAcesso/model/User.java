package com.controleDeAcesso.ControleDeAcesso.model;

import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String username;
    private String passaword;

    private List<String> roles;

    public User(){

    }

    public User(String username) {
        this.username = username;
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

    public String getPassword() {
        return passaword;
    }

    public void setPassaword(String password) {
        this.passaword = password;
    }
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);

    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password=" + passaword +
                ", roles=" + roles +
                '}';
    }
}




