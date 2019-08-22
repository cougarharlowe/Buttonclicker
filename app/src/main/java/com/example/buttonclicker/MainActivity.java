package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerbutton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generally set up intitial  values here
        timesClicked = 0;
        // wiring widgets  links the xml to the java
        buttonClickerbutton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onClickerClicked(View view) {
        Toast.makeText(this, "hit the woah", Toast.LENGTH_LONG).show();
        // increase the times clicked, show the value


        timesClicked++;
        //show the value

      textViewScore.setText("score: " +  timesClicked);

      changebackgroundcolor();

    }

    private void changebackgroundcolor() {
        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        int color = Color.rgb (r, g, b);
        constraintLayout.setBackgroundColor(color);

    }
}
