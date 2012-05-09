package com.feelthebeats.charter;

/**
 * JSNexen
 * 5/8/12
 * 8:21 PM
 */
public class NoteFactory {

    public enum NoteType {
        TAP, HOLD
    }

    public Note get(NoteType type) {
        Note note = null;
        switch (type) {
            case TAP:
                note = new TapNote();
                break;
            case HOLD:
                note = new HoldNote();
                break;
            default:
                break;
        }
        return note;
    }

}
