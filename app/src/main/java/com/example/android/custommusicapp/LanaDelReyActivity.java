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

        songs.add(new Song("Song: Summertime Sadness", "Artist: Lana Del Rey", "Album: Borne to Die", false));
        songs.add(new Song("Song: Salvatore", "Artist: Lana Del Rey", "Album: Honeymoon", false));
        songs.add(new Song("Song: 13 Beaches", "Artist: Lana Del Rey", "Album: Lust for Life", false));
        songs.add(new Song("Song: Shades of Cool", "Artist: Lana Del Rey", "Album: Ultraviolence", false));
        songs.add(new Song("Song: Blue Jeans", "Artist: Lana Del Rey", "Album: Born to Die", false));

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
