package com.Saurabh.event.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ResponseEvent {
    private String title;
    private LocalDate date;
    private String location;
    private String desc;
}
