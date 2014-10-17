package com.xuewei8910.nearme.controller;

import com.xuewei8910.nearme.repository.Comment;
import com.xuewei8910.nearme.repository.Event;
import com.xuewei8910.nearme.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Wei on 2014/10/16.
 */

@Controller
public class EventController {
    @Autowired
    private EventRepository eventRepository;


    @RequestMapping(value = "/event/{id}", method = RequestMethod.GET)
    public @ResponseBody Event getEventById(@PathVariable("id")long id){
        return eventRepository.findById(id).get(0);
    }

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public @ResponseBody Iterable<Event> getEventList(@RequestParam(value = "longitude") double longitude,
                                                  @RequestParam(value = "latidude") double latitude){
        return eventRepository.findAll();
    }



}
