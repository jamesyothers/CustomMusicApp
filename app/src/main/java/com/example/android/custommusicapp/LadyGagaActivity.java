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

        words.add(new Song("one", "lutti", "yes"));
        words.add(new Song("one", "lutti", "yes"));
        words.add(new Song("one", "lutti", "yes"));
        words.add(new Song("one", "lutti", "yes"));
        words.add(new Song("one", "lutti", "yes"));

        SongAdapter songAdapter = new SongAdapter(this, words);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }

}
