package com.Saurabh.event.service;

import com.Saurabh.event.request.RequestEvent;
import com.Saurabh.event.response.ResponseEvent;

import java.util.List;

public interface EventService {
    public List<ResponseEvent> getAllEvents();
    public ResponseEvent getEvent(String name);
    public ResponseEvent addEvent(RequestEvent request);
    public ResponseEvent updateEvent(String title,RequestEvent request);
}
