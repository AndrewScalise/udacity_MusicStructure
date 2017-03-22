package com.skuhleesi.musicstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view for playlist activity
        TextView playlists = (TextView)findViewById(R.id.playlists);

        //Set a click listener on that view
        playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                //Start the new activity
                startActivity(playlistsIntent);
            }
        });

        //Find view for albums activity
        TextView albums = (TextView)findViewById(R.id.albums);

        //Set a click listener on that view
        playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                //Start the new activity
                startActivity(albumsIntent);
            }
        });

        //Find view for songs activity
        TextView songs = (TextView)findViewById(R.id.songs);

        //Set a click listener on that view
        playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                //Start the new activity
                startActivity(songsIntent);
            }
        });

        //Find view for artists activity
        TextView artists = (TextView)findViewById(R.id.artists);

        //Set a click listener on that view
        playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                //Start the new activity
                startActivity(artistsIntent);
            }
        });
    }
}
