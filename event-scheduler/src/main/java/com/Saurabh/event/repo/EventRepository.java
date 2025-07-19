package com.Saurabh.event.repo;

import com.Saurabh.event.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {


    Event findByTitle(String name);
}
