package com.Saurabh.event.service.impl;

import com.Saurabh.event.entity.Event;
import com.Saurabh.event.repo.EventRepository;
import com.Saurabh.event.request.RequestEvent;
import com.Saurabh.event.response.ResponseEvent;
import com.Saurabh.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository repo;

    @Override
    public List<ResponseEvent> getAllEvents() {
        List<Event> list = repo.findAll ();
        List<ResponseEvent> response = new ArrayList<> ();
        for (Event e : list) {
            ResponseEvent res = new ResponseEvent ();
            res.setTitle (e.getTitle ());
            res.setDate (e.getDate ());
            res.setLocation (e.getLocation ());
            res.setDesc (e.getDesc ());
            response.add (res);
        }
        return response;
    }

    @Override
    public ResponseEvent getEvent(String name) {
        Event event = repo.findByTitle (name);
        ResponseEvent res = new ResponseEvent ();
        res.setTitle (event.getTitle ());
        res.setDate (event.getDate ());
        res.setLocation (event.getLocation ());
        res.setDesc (event.getDesc ());
        return res;
    }

    @Override
    public ResponseEvent addEvent(RequestEvent request) {
        Event event = new Event ();
        event.setTitle (request.getTitle ());
        event.setDate (request.getDate ());
        event.setLocation (request.getLocation ());
        event.setDesc (request.getDesc ());

        Event saved = repo.save (event);

        ResponseEvent res = new ResponseEvent ();
        res.setTitle (saved.getTitle ());
        res.setDate (saved.getDate ());
        res.setLocation (saved.getLocation ());
        res.setDesc (saved.getDesc ());

        return res;
    }

    @Override
    public ResponseEvent updateEvent(String title,RequestEvent request) {
        Event event = repo.findByTitle (title);
        event.setTitle (request.getTitle ());
        event.setDate (request.getDate ());
        event.setLocation (request.getLocation ());
        event.setDesc (request.getDesc ());

        Event saved = repo.save (event);

        ResponseEvent res = new ResponseEvent ();
        res.setTitle (saved.getTitle ());
        res.setDate (saved.getDate ());
        res.setLocation (saved.getLocation ());
        res.setDesc (saved.getDesc ());

        return res;
    }

}