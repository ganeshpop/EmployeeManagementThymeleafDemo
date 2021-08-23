package com.ganesh.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@ToString
@Getter
@Setter
@Entity
@Table(name = "MyUser")
public class User {

    @Id
    private String username;
    private String password;

    public User() {

    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }


}