package com.example.android.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void tapped (View view ){
int id=view.getId();
String ourId="";
ourId=view.getResources().getResourceEntryName(id);
int resourceId=getResources().getIdentifier(ourId,"raw","com.example.android.phrases");
        MediaPlayer mplayer = MediaPlayer.create(this,resourceId);
mplayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
