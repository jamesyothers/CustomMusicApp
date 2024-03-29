package com.example.android.custommusicapp;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> song) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, song);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        // Get the version name from the current song object and
        // set this text on the name TextView
        songNameTextView.setText(currentSong.getSongName());

        songNameTextView.setTextColor(Color.WHITE);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        albumNameTextView.setText(currentSong.getAlbumName());

        albumNameTextView.setTextColor(Color.WHITE);

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
