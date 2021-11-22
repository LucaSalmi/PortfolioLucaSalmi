package com.example.portfoliolucasalmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.clans.fab.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    FloatingActionButton aboutMe;
    FloatingActionButton contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutMe = findViewById(R.id.about_me_page_btn);
        contacts = findViewById(R.id.contact_page_btn);

        RecyclerView list = findViewById(R.id.recycler_list);
        CustomAdapter adapter = new CustomAdapter(arrayGenerator(), MainActivity.this);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);

        setListeners();

    }

    public ListData[] arrayGenerator() {

        ListData[] listDataArray = new ListData[]{

                new ListData(getString(R.string.calc_title),
                        getString(R.string.calc_short_desc),
                        R.drawable.ic_baseline_calculate_24, ProjectActivity.class,
                        ResourceManager.photoArray(0), getString(R.string.calc_full_desc), ResourceManager.linkMaker(0, this)),

                new ListData(getString(R.string.restaurant_title),
                        getString(R.string.restaurant_short_desc),
                        R.drawable.ic_baseline_restaurant_menu_24, ProjectActivity.class,
                        ResourceManager.photoArray(1), getString(R.string.restaurant_full_desc), ResourceManager.linkMaker(1, this)),

                new ListData(getString(R.string.bmi_title),
                        getString(R.string.bmi_short_desc),
                        R.drawable.bmi_icon_48x48, ProjectActivity.class,
                        ResourceManager.photoArray(2), getString(R.string.bmi_full_desc), ResourceManager.linkMaker(2, this)),

                new ListData(getString(R.string.notepad_title),
                        getString(R.string.notepad_short_desc),
                        R.drawable.my_notepad_icon, ProjectActivity.class,
                        ResourceManager.photoArray(3), getString(R.string.notepad_full_desc), ResourceManager.linkMaker(3, this)),

                new ListData(getString(R.string.kotlin_calc_title),
                        getString(R.string.kotlin_calc_short_desc),
                        R.drawable.ic_baseline_calculate_24, ProjectActivity.class,
                        ResourceManager.photoArray(4), getString(R.string.kotlin_calc_full_desc), ResourceManager.linkMaker(4, this))


        };

        return listDataArray;
    }

    public void setListeners() {


        aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent floatingButtons = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(floatingButtons);

            }
        });

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent floatingButtons = new Intent(MainActivity.this, ContactsActivity.class);
                startActivity(floatingButtons);

            }
        });


    }
}