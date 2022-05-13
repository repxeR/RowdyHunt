package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class jplRiddle extends AppCompatActivity {

    //Riddle answer string!
    public static final String ANSWER = "general posting board";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpl_riddle);
    }
    //Show hint 1 && change opacity button 2
    public void changeOpacityBtn2(View view){
        TextView hint1 = findViewById(R.id.hint1Txt);
        Button btn2 = findViewById(R.id.button2);
        hint1.setAlpha(1);
        btn2.setAlpha(1);
    }

    //Show hint 2 && change opacity button 3
    public void changeOpacityBtn3(View view){
        TextView hint2 = findViewById(R.id.hint2Txt);
        Button btn3 = findViewById(R.id.button3);
        btn3.setAlpha(1);
        hint2.setAlpha(1);

    }

    //shows hint 3
    public void showHint3(View view){
        TextView hint3 = findViewById(R.id.hint3Txt);
        hint3.setAlpha(1);
    }

    public void checkAnswer(View view){
        EditText answer = findViewById(R.id.userInput);
        String message = answer.getText().toString();
        TextView inc = findViewById(R.id.incorrect);
        if(message.equalsIgnoreCase(ANSWER)){
            //Go to next screen
            //test.setText("CORRECT");
            openNextScreen();
        }
        else {
            //Repeat?
            //possibly dont even need this else statement, only if we want to implement if something is wrong
            inc.setText("INCORRECT");
        }
    }
    public void openNextScreen() {
        Intent intent = new Intent(this, jplToBusiness.class);
        startActivity(intent);
    }

}