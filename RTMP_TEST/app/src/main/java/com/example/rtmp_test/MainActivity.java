package com.example.rtmp_test;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private VideoView mainVideoView;

    private Uri videoUri;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainVideoView = (VideoView) findViewById(R.id.MainVideoView);

        videoUri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/project-drawing-6cd8e.appspot.com/o/KakaoTalk_Video_20200215_1416_18_384.mp4?alt=media&token=638fa3c0-cd33-4ef1-a113-9fc69eb05c6c");

        mainVideoView.setVideoURI(videoUri);
        mainVideoView.requestFocus();
        mainVideoView.start();
    }
}
