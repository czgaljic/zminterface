package com.nsxtreme.zm.controller;

import com.nsxtreme.zm.api.ZmApi;
import com.nsxtreme.zm.models.EventList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by chris on 4/28/2017.
 */
@RestController
public class EventController {
    /*
    Group by time and monitor so that every active image per second can be displayed. for example
    array
        <time>,[events]
        go through all events and display based on monitor montior 1, monitor 2 , monitor 3
    */
    @Autowired
    ZmApi zmapi;

    @RequestMapping("/default")
    public EventList[] defaultListing(){
        LocalDateTime endDate = LocalDateTime.now();
        LocalDateTime startDate = endDate.minus(1, ChronoUnit.HOURS);
        zmapi.getEventsDateRange(startDate,endDate);

    }
}
