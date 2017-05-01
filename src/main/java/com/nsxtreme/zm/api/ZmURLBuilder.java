package com.nsxtreme.zm.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by chris on 5/1/2017.
 */
@Component
public class ZmURLBuilder {
    @Value("${api.serverRootURL}")
    public  String serverURL;
    private final String ALL_EVENTS="zm/api/events.json";
    private final String DATE_RANGE="zm/api/events/index/StartTime >=:%s/EndTime <=:%s.json";



    //http://surveil/zm/api/events/index/StartTime%20%3E=:2017-04-25%2018:43:56/EndTime%20%3C=:2017-04-27%2014:00:56.json?page=2
    // image http://surveil/zm/index.php?view=image&path=/3/17/04/24/12/57/05/00107-capture.jpg&scale=100



    protected String getAllEventsURL(){
        return serverURL+"/"+ALL_EVENTS;
    }


    protected String getEventsDateRange(LocalDateTime start, LocalDateTime end){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startString =start.format(formatter);
        String endString = end.format(formatter);
        return  serverURL+"/"+String.format(DATE_RANGE,startString,endString);
    }
}
