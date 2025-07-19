package com.Saurabh.event.controller;


import com.Saurabh.event.request.RequestEvent;
import com.Saurabh.event.response.ResponseEvent;
import com.Saurabh.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class EventController {
    @Autowired
EventService service;
    @GetMapping("/events")
    public List<ResponseEvent> getAllEvents(){
   System.out.println ("Controller class");
        return service.getAllEvents ();
    }
    @GetMapping("/event/{name}")
public ResponseEntity<ResponseEvent> getEvent(@PathVariable String name){
        return ResponseEntity.ok(service.getEvent (name));
}
@PostMapping("/event")
    public ResponseEntity<ResponseEvent> addEvent(@RequestBody RequestEvent request){
        return ResponseEntity.ok(service.addEvent (request));
    }

    @PutMapping("/event/{name}")
    public ResponseEntity<ResponseEvent> updateEvent(@PathVariable String name,@RequestBody RequestEvent request){
        return ResponseEntity.ok(service.updateEvent (name,request));
    }

}
