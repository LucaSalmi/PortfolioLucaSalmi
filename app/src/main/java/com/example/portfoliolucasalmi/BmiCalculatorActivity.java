package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class BmiCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        ViewPager gallery = findViewById(R.id.photo_gallery);

        int[] sliderImageId = new int[]{


        };

        ImageAdapter imageAdapter = new ImageAdapter(this, sliderImageId);
        gallery.setAdapter(imageAdapter);

    }
}