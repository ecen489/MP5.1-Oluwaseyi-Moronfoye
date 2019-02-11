package com.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void radioClick(View view)
    {
        ImageView myImageView = (ImageView) findViewById(R.id.imageView);

        if(view.getId() == R.id.f1)
        {
            myImageView.setImageResource(R.drawable.seconds45);

            try
            {
                mp.reset();
            }
            catch(Exception ex)
            {

            }

            mp = MediaPlayer.create(this,R.raw.seconds45);

            try
            {
                mp.prepare();

            }
            catch(Exception ex)
            {

            }
            mp.start();

        }
        else if(view.getId() == R.id.f2)
        {
            myImageView.setImageResource(R.drawable.headlines);
            try
            {
                mp.reset();
            }
            catch(Exception ex)
            {

            }



            mp = MediaPlayer.create(this,R.raw.headlines);
            try
            {
                mp.prepare();

            }
            catch(Exception ex)
            {

            }
            mp.start();
        }
        else
        {
            myImageView.setImageResource(R.drawable.when);

            try
            {
                mp.reset();
            }
            catch(Exception ex)
            {

            }
            mp = MediaPlayer.create(this,R.raw.when);

            try
            {
                mp.prepare();

            }
            catch(Exception ex)
            {

            }
            mp.start();
        }
    }

    public void pauseMusic(View view) {
        if(mp.isPlaying())
            mp.pause();

    }

    public void playMusic(View view) {
        mp.start();
    }
}
