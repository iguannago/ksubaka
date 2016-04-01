package com.ksubaka.album;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by davicres on 01/04/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class AlbumWrapper {

    @JsonProperty("albums")
    private Albums albums = new Albums();

    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "AlbumList{" +
                "albums=" + albums +
                '}';
    }
}
