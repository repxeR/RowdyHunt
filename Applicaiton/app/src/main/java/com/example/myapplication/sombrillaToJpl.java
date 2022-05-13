package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class sombrillaToJpl extends AppCompatActivity {
    private static final String pass = "to JPL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sombrilla_to_jpl);

        //get button
        Button nextBtn = findViewById(R.id.nexta3);
        //set button to do stuff. Here we're passing in new instance of an onclick listener
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(pass, "User headed to JPL next scene");
                //load map with JPL enabled

                //ON yes we will swap scenes to the JPL riddle
                openNextScreen();

            }
        });
    }
    public void openNextScreen() {
        Intent intent = new Intent(this, jplRiddle.class);
        startActivity(intent);
    }

}
