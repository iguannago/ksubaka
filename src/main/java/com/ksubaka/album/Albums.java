package com.ksubaka.album;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davicres on 01/04/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class Albums {
    @JsonProperty("items")
    private List<Album> albumList = new ArrayList<Album>();

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "albumList=" + albumList +
                '}';
    }
}
