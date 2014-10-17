package com.xuewei8910.nearme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wei on 2014/10/16.
 */
@Repository
public interface CommentRepository extends CrudRepository<Comment,Long> {
    public List<Comment> findById(long id);
    public List<Comment> findByAuthor(User author);
    public List<Comment> findByEvent(Event event);
}
