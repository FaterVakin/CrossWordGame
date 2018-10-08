package edu.ktu.crosswordgame;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CrosswordActivity extends AppCompatActivity{

    private GridView gridView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.crossword_activity_layout);
        Intent intent = getIntent();

        gridView = (GridView) findViewById(R.id.grid);
        List<GridItem> gridItemList = new ArrayList<>();
        Boolean bool = false;
        for(int i = 0; i < 50; i++)
        {

            GridItem gridItem = new GridItem("", "B", bool);
            gridItemList.add(gridItem);
            Random rand = new Random();
            bool = rand.nextBoolean();
        }

        GridAdapter adapter = new GridAdapter(this, gridItemList);
        gridView.setAdapter(adapter);
        //setupGrid();
    }
}


