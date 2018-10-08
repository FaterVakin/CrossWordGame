package edu.ktu.crosswordgame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {


    private Button startButton;
    private Button optionsButton;
    private Button exitButton;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.menu_activity_layout);
        startButton = (Button) findViewById(R.id.startButton);
        optionsButton = (Button) findViewById(R.id.optionsButton);
        exitButton = (Button) findViewById(R.id.exitButton);
        startButton.setOnClickListener(startGame);
        optionsButton.setOnClickListener(goToOptions);
        exitButton.setOnClickListener(exit);
    }

    View.OnClickListener startGame = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(context, CrosswordActivity.class);
            context.startActivity(intent);
        }
    };

    View.OnClickListener goToOptions = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(context, OptionsActivity.class);
            context.startActivity(intent);
        }
    };

    View.OnClickListener exit = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            finish();
            System.exit(0);
        }
    };
}
