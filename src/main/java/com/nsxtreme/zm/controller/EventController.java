package com.nsxtreme.zm.controller;

import com.nsxtreme.zm.api.ZmApi;
import com.nsxtreme.zm.models.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

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

    @RequestMapping("/search")
    public Events defaultListing(@RequestParam(value="startDate") String startDate, @RequestParam(value="endDate")String endDate, @RequestParam(value="page", defaultValue="1") String page){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime endDateTime = LocalDateTime.parse(endDate,formatter);
        LocalDateTime startDateTime = LocalDateTime.parse(startDate,formatter);
        return zmapi.getAllEvents(startDateTime,endDateTime,page);
    }


}
