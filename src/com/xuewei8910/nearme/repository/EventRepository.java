package com.xuewei8910.nearme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wei on 2014/10/16.
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Long>{
    public List<Event> findById(long id);
    public List<Event> findByTitle(String title);
    public List<Event> findByAuthor(User author);
}
