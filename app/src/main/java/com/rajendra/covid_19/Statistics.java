package com.rajendra.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Statistics extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        back = findViewById(R.id.imageView);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(Statistics.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });
    }

    // Task Completed
    // Thanks for watching
    //See you in the next video.
}
