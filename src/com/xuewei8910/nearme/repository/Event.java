package com.xuewei8910.nearme.repository;

import java.util.List;
import javax.persistence.*;

/**
 * Created by Wei on 2014/10/16.
 */
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Comment> comments;

    private double longitude;
    private double latitude;
    private String createTime;
    private String title;
    private String content;


    public Event(){}

    public Event(long id, String title, String content, User author, double longitude,
                 double latitude, String createTime, List<Comment> comments){
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createTime = createTime;
        this.comments = comments;
    }

    public long getId(){
        return this.id;
    }

    public String getContent(){
        return this.content;
    }

    public User getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public List<Comment> getComments(){
        return this.comments;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public String getCreateTime(){
        return this.createTime;
    }
}

