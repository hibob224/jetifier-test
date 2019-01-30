package com.galajeu.jetifierexample;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.galajeu.jetifierissue2.JetifierResultReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JetifierResultReceiver receiver = new JetifierResultReceiver(new Handler());
    }
}
