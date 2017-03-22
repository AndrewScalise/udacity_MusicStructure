package com.skuhleesi.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mugen on 3/22/2017.
 */

public class PlaylistsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //Find the button that shows the now playing activity
        Button nowplaying = (Button)findViewById(R.id.nowplaying);

        //Set a click listener on that button
        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open then {@link NowPlayingAcivity}
                Intent nowplayingIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);

                //Start new activity
                startActivity(nowplayingIntent);
            }
        });
    }
}
