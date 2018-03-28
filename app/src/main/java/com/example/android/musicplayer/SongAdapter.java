package com.example.android.musicplayer;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aneta BIEDERMAN on 26 Mar 2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID songs_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the Song name from the currentSong object and set this text on
        // the Song TextView.
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the Artist name from the currentSong object and set this text on
        // the Artist TextView.
        artistTextView.setText(currentSong.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID album_name.
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_name);
        // Get the Artist name from the currentSong object and set this text on
        // the Artist TextView.
        albumTextView.setText(currentSong.getAlbumName());

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
