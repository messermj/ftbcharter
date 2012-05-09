package com.feelthebeats.charter;

/**
 * Matthew Commonis
 * 5/8/12
 * 8:01 PM
 */
public abstract class Note implements Drawable, Comparable<Note> {

    private char column;
    private float beat;

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public float getBeat() {
        return beat;
    }

    public void setBeat(float beat) {
        this.beat = beat;
    }

    @Override
    public void draw() {
        //TODO: note draw function
    }

    @Override
    public int compareTo(Note o) {
        if (this.beat != o.beat) {
            return (int) (this.beat - o.beat);
        } else {
            return this.column - o.column;
        }
    }
}
