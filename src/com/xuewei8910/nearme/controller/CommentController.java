package com.xuewei8910.nearme.controller;

import com.xuewei8910.nearme.repository.Comment;
import com.xuewei8910.nearme.repository.CommentRepository;
import com.xuewei8910.nearme.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wei on 2014/10/16.
 */

@Controller
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/event/{id}/comment", method = RequestMethod.GET)
    public @ResponseBody List<Comment> getCommentByEvent(@PathVariable("id") long id){
        return commentRepository.findByEvent(eventRepository.findById(id).get(0));
    }

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public @ResponseBody Comment addComment(@RequestBody Comment c){
        return commentRepository.save(c);
    }
}
