package com.xuewei8910.nearme.repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Wei on 2014/10/16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Event> eventList;

    private String username;
    private String email;
    private String first_name;
    private String last_name;

    public User(long id, String username, String email, String first_name, String last_name){
        this.id = id;
        this.username = username;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public User(String username){
        this.username = username;
    }

    protected User(){
    }

    public String getUsername(){
        return username;
    }

    public long getId(){
        return id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getFirst_name(){
        return this.first_name;
    }

    public String getLast_name(){
        return this.last_name;
    }
}
