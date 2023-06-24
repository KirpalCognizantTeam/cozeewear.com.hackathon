package com.cozeewear.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "internal_user")

public class InternalUser {
    //create variables for the class InternalUser with the following names and data types:  id (int), username (String), password (String
    @Id
    private int id;
    private String username;
    private String password;

    //create a default constructor
    public InternalUser() {
    }


    //create a parameterized constructor
    public InternalUser(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //create getters and setters for the variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
