package com.example.android.custommusicapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.Math;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LanaDelReyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Song: Applause", "Artist: Lady Gaga", "Album: ARTPOP", false));
        songs.add(new Song("Song: Paparazzi", "Artist: Lady Gaga", "Album: The Fame", false));
        songs.add(new Song("Song: Speechless", "Artist: Lady Gaga", "Album: The Fame Monster", false));
        songs.add(new Song("Song: Angel Down", "Artist: Lady Gaga", "Album: Joanne", false));
        songs.add(new Song("Song: Bad Kids", "Artist: Lady Gaga", "Album: Borne This Way", false));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        // randomly select a song to play
        int randomIndex = (int) (Math.random() * songs.size());
        songs.get(randomIndex).setPlaying(true);

        String songPlaying = songs.get(randomIndex).getSongName();
        String albumPlaying = songs.get(randomIndex).getAlbumName();

        // get the song randomly selected to play
        // refactor to move to a utility since this is in every activity
        final TextView songPlayingTextView = findViewById(R.id.song_playing);
        songPlayingTextView.setText(songPlaying);

        final TextView albumPlayingTextView = findViewById(R.id.album_playing);
        albumPlayingTextView.setText(albumPlaying);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }

}
