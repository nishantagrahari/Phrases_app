package com.nagrahari.pharases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void Onclick(View view){

        int id=view.getId();
        String ourId="";

        ourId = view.getResources().getResourceEntryName(id);
        int resourceId=getResources().getIdentifier(ourId,"raw","com.nagrahari.pharases");

        MediaPlayer mediaPlayer=MediaPlayer.create(this,resourceId);
        mediaPlayer.start();

        Log.i("tapped button is",ourId);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
