package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Aneta BIEDERMAN on 27 Mar 2018.
 */

public class Search extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.search);

        TextView song = (TextView) findViewById(R.id.songs_category);
        song.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent songIntent = new Intent(Search.this, MainActivity.class);
                startActivity(songIntent);
            }
        });


}}
