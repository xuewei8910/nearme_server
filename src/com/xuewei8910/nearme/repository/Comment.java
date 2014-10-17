package com.xuewei8910.nearme.repository;

import javax.persistence.*;

/**
 * Created by Wei on 2014/10/16.
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User author;

    private String content;
    private String createtime;

    public Comment(long id, Event event, User u, String content){
        this.id = id;
        this.event = event;
        this.author = u;
        this.content = content;
    }

    public long getId(){
        return this.id;
    }

    public long getEventId(){
        return this.event.getId();
    }

    public User getAuthor(){
        return this.author;
    }

    public String getContent(){
        return this.content;
    }

    public String getCreatetime(){
        return this.createtime;
    }
}
