package com.Saurabh.event.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class RequestEvent {
    private String title;
    private LocalDate date;
    private String location;
    private String desc;
}
