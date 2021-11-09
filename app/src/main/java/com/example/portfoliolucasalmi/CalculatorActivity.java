package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        ViewPager gallery = findViewById(R.id.photo_gallery);

        int[] sliderImageId = new int[]{

                R.drawable.calculator_screen_1,
                R.drawable.calculator_screen_2,
                R.drawable.calculator_screen_3,
                R.drawable.calculator_screen_4,
        };

        ImageAdapter imageAdapter = new ImageAdapter(this, sliderImageId);
        gallery.setAdapter(imageAdapter);
    }
}