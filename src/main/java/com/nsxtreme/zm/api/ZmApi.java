package com.nsxtreme.zm.api;



import com.nsxtreme.zm.Application;
import com.nsxtreme.zm.models.Events;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by chris on 4/26/2017.
 */
@Component
public class ZmApi {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ZmURLBuilder zmURLBuilder;


    private static final Logger log = Logger.getLogger(ZmApi.class);

    public Events getAllEvents(){
        return restTemplate.getForObject(zmURLBuilder.getAllEventsURL(),Events.class);
    }

    public Events getAllEvents(LocalDateTime start, LocalDateTime end,String page){
        String requestURL = zmURLBuilder.getEventsDateRange(start,end,page);
        log.info(requestURL);
        return restTemplate.getForObject(requestURL,Events.class);
    }
}
