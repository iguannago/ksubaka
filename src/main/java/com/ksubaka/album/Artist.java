package com.ksubaka.album;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by davicres on 01/04/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class Artist {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Artist{" + name + '\'' +
                '}';
    }
}
