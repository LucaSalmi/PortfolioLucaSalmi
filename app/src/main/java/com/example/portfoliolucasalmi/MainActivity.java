package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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

    public ListData[] arrayGenerator(){

        ListData[] listDataArray = new ListData[]{

                new ListData(getString(R.string.calc_title),
                        getString(R.string.calc_short_desc),
                        R.drawable.ic_baseline_calculate_24, ProjectActivity.class,
                        photoArray(0), getString(R.string.calc_full_desc), linkMaker(0)),

                new ListData(getString(R.string.restaurant_title),
                        getString(R.string.restaurant_short_desc),
                        R.drawable.ic_baseline_restaurant_menu_24, ProjectActivity.class,
                        photoArray(1), getString(R.string.restaurant_full_desc), linkMaker(1)),

                new ListData(getString(R.string.bmi_title),
                        getString(R.string.bmi_short_desc),
                        R.drawable.bmi_icon_48x48, ProjectActivity.class,
                        photoArray(2), getString(R.string.bmi_full_desc), linkMaker(2)),

                new ListData(getString(R.string.notepad_title),
                        getString(R.string.notepad_short_desc),
                        R.drawable.my_notepad_icon, ProjectActivity.class,
                        photoArray(3), getString(R.string.notepad_full_desc), linkMaker(3))
        };

        return listDataArray;
    }


    public int[] photoArray(int id) {

        int[] sliderImageId;

        switch (id) {

            case 0:

                sliderImageId = new int[]{

                        R.drawable.calculator_screen_1,
                        R.drawable.calculator_screen_2,
                        R.drawable.calculator_screen_3,
                        R.drawable.calculator_screen_4,
                };
                break;

            case 1:

                sliderImageId = new int[]{

                        R.drawable.restaurant_menu_1,
                        R.drawable.restaurant_menu_2,
                        R.drawable.restaurant_menu_3,
                };
                break;

            case 2:

                sliderImageId = new int[]{

                        R.drawable.bmi_screenshot_1,
                        R.drawable.bmi_screenshot_2,
                };
                break;

            case 3:

                sliderImageId = new int[]{

                        R.drawable.notepad_screenshot_1,
                        R.drawable.notepad_screenshot_2,
                        R.drawable.notepad_screenshot_3,
                };
                break;

            default:
                sliderImageId = new int[]{
                };
                break;
        }

        return sliderImageId;
    }

    private String linkMaker(int linkId) {

        String link;

        switch (linkId) {
            case 0:
                link = "https://github.com/LucaSalmi/Calculator-Grupp-4";
                break;
            case 1:
                link = "https://github.com/LucaSalmi/RestaurangsMeny";
                break;
            case 2:
                link = "https://github.com/LucaSalmi/BMI-Calculator";
                break;
            case 3:
                link = "https://github.com/LucaSalmi/My_Notepad";
                break;
            default:
                link = "https://github.com/LucaSalmi";
                break;
        }
        return link;
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