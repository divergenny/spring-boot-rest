package com.divergenny.springbootrest;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JacksonXmlRootElement(localName = "aliens")
public class Alien {
    @Id
    private Long id;
    private String name;
    private int points;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alien{"
                + "name='" + name + '\''
                + ", points=" + points
                + ", id=" + id
                + '}';
    }
}
