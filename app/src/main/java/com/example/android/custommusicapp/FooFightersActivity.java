package com.example.android.custommusicapp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.Math;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class FooFightersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Song: My Hero", "Artist: Foo Fighters", "Album: The Colour and the Shape", false));
        songs.add(new Song("Song: This is a Call", "Artist: Foo Fighters", "Album: Foo Fighters", false));
        songs.add(new Song("Song: Stacked Actors", "Artist: Foo Fighters", "Album: There is Nothing Left to Lose", false));
        songs.add(new Song("Song: I am a River", "Artist: Foo Fighters", "Album: Sonic Highways", false));
        songs.add(new Song("Song: The Deepest Blues are Black", "Artist: Foo Fighters", "Album: In Your Honor", false));

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
