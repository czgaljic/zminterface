package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by chris on 4/24/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {
    public EventItem[] getEvents() {
        return events;
    }

    public void setEvents(EventItem[] events) {
        this.events = events;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    Pagination pagination;
    EventItem[] events;
}
