package com.example.roman.radio.services;

import com.example.roman.radio.model.Station;

import java.util.ArrayList;

/**
 * Created by Roman on 8/15/16.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance()
    {
        return ourInstance;
    }

    private DataService()
    {

    }

    public ArrayList<Station> getFeaturedStations()
    {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheeling' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations()
    {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations()
    {
        ArrayList<Station> list = new ArrayList<>();
        return  list;
    }
}
