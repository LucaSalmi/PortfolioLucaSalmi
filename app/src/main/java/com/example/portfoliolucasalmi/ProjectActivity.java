package com.example.portfoliolucasalmi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ProjectActivity extends AppCompatActivity {

    int[] sliderImageId;
    ViewPager gallery;
    TextView title;
    TextView description;
    ImageButton gitHub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        gallery = findViewById(R.id.photo_gallery);
        title = findViewById(R.id.project_title);
        description = findViewById(R.id.project_description);
        gitHub = findViewById(R.id.gitHubLink);

        title.setText(getIntent().getStringExtra("Title"));
        description.setText(getIntent().getStringExtra("fullDescription"));
        sliderImageId = getIntent().getIntArrayExtra("photoArray");

        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri gitHubLink = Uri.parse(getIntent().getStringExtra("gitHubLink"));
                Intent link = new Intent(Intent.ACTION_VIEW, gitHubLink);
                startActivity(link);
            }
        });

        ImageAdapter imageAdapter = new ImageAdapter(this, sliderImageId);
        gallery.setAdapter(imageAdapter);
    }
}