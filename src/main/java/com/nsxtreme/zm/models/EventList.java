package com.nsxtreme.zm.models;

import java.time.LocalDateTime;

/**
 * Created by chris on 4/28/2017.
 */
public class EventList {
    LocalDateTime time;
    Event[] active;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Event[] getActive() {
        return active;
    }

    public void setActive(Event[] active) {
        this.active = active;
    }
}
