package com.ksubaka.album;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davicres on 01/04/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class Album {
    @JsonProperty("name")
    private String title;
    @JsonProperty("release_date")
    private String year;
    private String id;
    @JsonProperty("artists")
    private List<Artist> artistList = new ArrayList<Artist>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public java.lang.String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    @Override
    public java.lang.String toString() {
        return "Album{" +
                "title=" + title +
                ", year=" + year +
                ","  + artistList +
                '}';
    }
}
