package com.example.android.custommusicapp;

public class Song {

    private String mSongName;
    private String mAlbumName;
    private boolean mPlaying;

    public Song (String SongName, String ArtistName, String AlbumName, boolean Playing) {
        mSongName = SongName;
        mAlbumName = AlbumName;
        mPlaying = Playing;
    }

    public String getSongName (){
        return mSongName;
    }

    public String getAlbumName (){ return mAlbumName; }

    public boolean setPlaying (boolean Playing) {
        mPlaying = Playing;
        return mPlaying;
    }

}
