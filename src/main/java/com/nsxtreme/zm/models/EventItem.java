package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by chris on 4/24/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventItem {
    @JsonProperty("Event")
    Event event;
    String thumbData;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getThumbData() {
        return thumbData;
    }

    public void setThumbData(String thumbData) {
        this.thumbData = thumbData;
    }



}
