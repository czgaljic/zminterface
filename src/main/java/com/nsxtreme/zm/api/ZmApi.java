package com.nsxtreme.zm.api;



import com.nsxtreme.zm.models.Events;
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

    public ZmApi(RestTemplate restTemplate,ZmURLBuilder zmURLBuilder){
        this.restTemplate=restTemplate;
        this.zmURLBuilder = zmURLBuilder;
    }

    public Events getAllEvents(){
        return restTemplate.getForObject(zmURLBuilder.getAllEventsURL(),Events.class);
    }


    public Events getAllEvents(){
        return restTemplate.getForObject("http://surveil/zm/api/events.json",Events.class);
    }


    public Events getAllEvents(LocalDateTime end){

    }



}
