package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

public class ProjectActivity extends AppCompatActivity {

    int[] sliderImageId;
    ViewPager gallery;
    TextView title;
    TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

         gallery = findViewById(R.id.photo_gallery);
         title = findViewById(R.id.project_title);
         description = findViewById(R.id.project_description);

         title.setText(getIntent().getStringExtra("Title"));
         description.setText(getIntent().getStringExtra("fullDescription"));
         sliderImageId = getIntent().getIntArrayExtra("photoArray");

        ImageAdapter imageAdapter = new ImageAdapter(this, sliderImageId);
        gallery.setAdapter(imageAdapter);
    }
}