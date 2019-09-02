package com.example.android.custommusicapp;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LadyGagaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> words = new ArrayList<Song>();

        words.add(new Song("Song: Applause", "Artist: Lady Gaga", "Album: ARTPOP"));
        words.add(new Song("Song: Paparazzi", "Artist: Lady Gaga", "Album: The Fame"));
        words.add(new Song("Song: Speechless", "Artist: Lady Gaga", "Album: The Fame Monster"));
        words.add(new Song("Song: Angel Down", "Artist: Lady Gaga", "Album: Joanne"));
        words.add(new Song("Song: Bad Kids", "Artist: Lady Gaga", "Album: Borne This Way"));

        SongAdapter songAdapter = new SongAdapter(this, words);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }

}
