package com.Saurabh.event.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "event")
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    @Column(name = "event_title")
    private String title;
    @Column(name = "event_date")
    private LocalDate date;
    @Column(name = "event_location")
    private String location;
    @Column(name = "event_description")
    private String desc;
}
