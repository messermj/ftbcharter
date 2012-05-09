package com.feelthebeats.charter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * JSNexen
 * 5/8/12
 * 9:19 PM
 */
public class DataStorage {

    private static DataStorage ourInstance = new DataStorage();

    public static DataStorage getInstance() {
        return ourInstance;
    }

    private DataStorage() {
    }

    private MetaData metaData = new MetaData();

    private TreeSet<Note> notes = new TreeSet<Note>();
    private TreeSet<Bpm> bpms = new TreeSet<Bpm>();
    private TreeSet<Stop> stops = new TreeSet<Stop>();

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public void add(ChartEntity entity) {
        if (entity instanceof Note) {
            Note note = (Note) entity;
            notes.add(note);
        } else if (entity instanceof Bpm) {
            Bpm bpm = (Bpm) entity;
            bpms.add(bpm);
        } else if (entity instanceof Stop) {
            Stop stop = (Stop) entity;
            stops.add(stop);
        }
    }
}
