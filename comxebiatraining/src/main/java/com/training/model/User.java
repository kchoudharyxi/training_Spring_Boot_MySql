package com.training.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by kchoudhary on 30-Sep-16.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String password;

    public User() { }

    public User(long id) {
        this.id = id;
    }

    public User(String name, String email, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
