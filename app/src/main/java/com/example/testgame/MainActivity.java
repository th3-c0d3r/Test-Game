package com.example.testgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = findViewById(R.id.play_button);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callPlay(v);
            }
        });

        Button scores = findViewById(R.id.scores_button);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callScores(v);
            }
        });
    }

    public void callPlay(View view){
        Intent intent = new Intent(this,PlayArea.class);
        startActivity(intent);
    }

    public void callScores(View view){
        Intent intent = new Intent(this,ScoresArea.class);
        startActivity(intent);
    }
}
