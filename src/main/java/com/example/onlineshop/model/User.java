package com.example.onlineshop.model;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name = "name")
    @NotEmpty(message = "*Please enter your name")
    private String name;
    @Column(name = "email")
    @Email(message = "*Please enter valid email")
    @NotEmpty(message = "*Please enter your email")
    private String email;
    @Column(name = "password")
    @NotEmpty(message = "*Please enter your password")
    @Length(min = 5, message = "*Your password length should be at least 5 characters")
    private String password;
    @Column(name = "active")
    private Integer active;
    @Column(name = "status")
    private String status;
    @Column(name = "token")
    private String token;
    @ManyToMany(cascade = CascadeType.DETACH )
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() { return active; }

    public void setActive(Integer active) { this.active = active; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }

    public Set<Role> getRoles() { return roles; }

    public void setRoles(Set roles) {
        this.roles = roles;
    }

}
