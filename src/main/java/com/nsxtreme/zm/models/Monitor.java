package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by chris on 4/24/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Monitor {
    int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getServerId() {
        return ServerId;
    }

    public void setServerId(int serverId) {
        ServerId = serverId;
    }

    public String getFunction() {
        return Function;
    }

    public void setFunction(String function) {
        Function = function;
    }

    String Name;
    int ServerId;
    String Function;
}
