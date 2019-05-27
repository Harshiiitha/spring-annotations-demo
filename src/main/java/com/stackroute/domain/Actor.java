package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    private String aname;
    private String agender;
    private int aage;

    public Actor() {
    }

    public Actor(String aname, String agender, int aage) {
        this.aname = aname;
        this.agender = agender;
        this.aage = aage;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAgender() {
        return agender;
    }

    public void setAgender(String agender) {
        this.agender = agender;
    }

    public int getAage() {
        return aage;
    }

    public void setAage(int aage) {
        this.aage = aage;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "aname='" + aname + '\'' +
                ", agender='" + agender + '\'' +
                ", aage=" + aage +
                '}';
    }
}
