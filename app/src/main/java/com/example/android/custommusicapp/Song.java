package com.example.android.custommusicapp;

public class Song {

    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song (String SongName, String ArtistName, String AlbumName) {
        mSongName = SongName;
        mArtistName = ArtistName;
        mAlbumName = AlbumName;
    }

    public String getSongName (){
        return mSongName;
    }

    public String getArtistName (){
        return mArtistName;
    }

    public String getAlbumName (){
        return mAlbumName;
    }

}
