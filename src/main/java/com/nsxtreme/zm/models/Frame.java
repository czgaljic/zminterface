package com.nsxtreme.zm.models;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Created by chris on 4/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Frame {
    int Id;
    int EventId;
    int FrameId;
    String Type;
    LocalDateTime TimeStamp;
    float Delta;
    int Score;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int eventId) {
        EventId = eventId;
    }

    public int getFrameId() {
        return FrameId;
    }

    public void setFrameId(int frameId) {
        FrameId = frameId;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public LocalDateTime getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        TimeStamp = timeStamp;
    }

    public float getDelta() {
        return Delta;
    }

    public void setDelta(float delta) {
        Delta = delta;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
