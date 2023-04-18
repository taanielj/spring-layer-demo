package com.example.springlayerdemo.businesslayer;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@SuppressWarnings("unused")
@Entity
@Table(name = "users")
public class User {
    @Id
    private long id;
    @Column(name = "user_name")
    @JsonProperty("user_name")
    private String userName;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;
    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String lastName;

    public User() {
    }

    public User(long id, String userName, String firstName, String lastName) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
