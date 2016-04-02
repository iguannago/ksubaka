package com.ksubaka;


import com.ksubaka.album.Artist;

import java.util.List;

/**
 * Created by davicres on 01/04/2016.
 */
public abstract class Item {
    public abstract String getTitle();
    public abstract String getYear();
    public abstract String getId();
    public abstract List<Artist> getArtistList();
    public abstract String getDirector();
    public abstract String getImdbID();
;}
