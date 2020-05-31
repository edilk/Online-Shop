package com.example.onlineshop.model;

import com.example.onlineshop.validators.ValidEmail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    @ValidEmail
    @NotEmpty(message = "*Please enter your email")
    private String email;
    @Column(name = "password")
    @NotEmpty(message = "*Please enter your password")
    @Length(min = 5, message = "*Your password length should be at least 5 characters")
    private String password;
    @Transient
    private String matchingPassword;
    @Column(name = "active")
    private Boolean active;
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}