package com.feelthebeats.charter;

/**
 * Matthew Commonis
 * 5/8/12
 * 8:29 PM
 */
public abstract class TimedEvent implements Comparable<TimedEvent> {

    private float time;
    private float value;

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public int compareTo(TimedEvent o) {
        return (int) (this.time - o.time);
    }
}
