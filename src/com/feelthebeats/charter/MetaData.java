package com.feelthebeats.charter;

/**
 * JSNexen
 * 5/8/12
 * 8:46 PM
 */
public class MetaData implements ChartEntity {

    private String songFilename;
    private String songTitle;
    private String songArtist;
    private String authorName;

    public String getSongFilename() {
        return songFilename;
    }

    public void setSongFilename(String songFilename) {
        this.songFilename = songFilename;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
