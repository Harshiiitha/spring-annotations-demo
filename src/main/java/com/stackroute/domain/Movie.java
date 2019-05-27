package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    private String m_name;

    @Autowired
    private Actor actor;

    public Movie(String m_name) {
        this.m_name = m_name;
    }

    public Movie(){

    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "m_name='" + m_name + '\'' +
                ", actor=" + actor +
                '}';
    }
}
