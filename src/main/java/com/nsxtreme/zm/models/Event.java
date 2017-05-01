package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Created by chris on 4/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("MonitorId")
    private int monitorId;
    private String name;
    private String cause;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("EndTime")
    private String endTime;
    @JsonProperty("Width")
    private int width;
    @JsonProperty("Height")
    private int height;
    @JsonProperty("Length")
    private float length;
    @JsonProperty("Frames")
    private int frames;
    @JsonProperty("AlarmFrames")
    private int alarmFrames;
    @JsonProperty("TotScore")
    private int totScore;
    @JsonProperty("AvgScore")
    private int avgScore;
    @JsonProperty("MaxScore")
    private int maxScore;
    @JsonProperty("Archived")
    private int archived;
    @JsonProperty("Videoed")
    private int videoed;
    @JsonProperty("Uploaded")
    private int uploaded;
    @JsonProperty("Emailed")
    private int emailed;
    @JsonProperty("Messaged")
    private int messaged;
    @JsonProperty("Eecuted")
    private int eecuted;
    @JsonProperty("Notes")
    private String notes;
    @JsonProperty("BasePath")
    private String basePath;
    @JsonProperty("Next")
    private int next;
    @JsonProperty("Prev")
    private int prev;
    @JsonProperty("NextOfMonitor")
    private int nextOfMonitor;
    @JsonProperty("PrevOfMonito")
    private int prevOfMonito;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getFrames() {
        return frames;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public int getAlarmFrames() {
        return alarmFrames;
    }

    public void setAlarmFrames(int alarmFrames) {
        this.alarmFrames = alarmFrames;
    }

    public int getTotScore() {
        return totScore;
    }

    public void setTotScore(int totScore) {
        this.totScore = totScore;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getArchived() {
        return archived;
    }

    public void setArchived(int archived) {
        this.archived = archived;
    }

    public int getVideoed() {
        return videoed;
    }

    public void setVideoed(int videoed) {
        this.videoed = videoed;
    }

    public int getUploaded() {
        return uploaded;
    }

    public void setUploaded(int uploaded) {
        this.uploaded = uploaded;
    }

    public int getEmailed() {
        return emailed;
    }

    public void setEmailed(int emailed) {
        this.emailed = emailed;
    }

    public int getMessaged() {
        return messaged;
    }

    public void setMessaged(int messaged) {
        this.messaged = messaged;
    }

    public int getEecuted() {
        return eecuted;
    }

    public void setEecuted(int eecuted) {
        this.eecuted = eecuted;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getNextOfMonitor() {
        return nextOfMonitor;
    }

    public void setNextOfMonitor(int nextOfMonitor) {
        this.nextOfMonitor = nextOfMonitor;
    }

    public int getPrevOfMonito() {
        return prevOfMonito;
    }

    public void setPrevOfMonito(int prevOfMonito) {
        this.prevOfMonito = prevOfMonito;
    }
}
