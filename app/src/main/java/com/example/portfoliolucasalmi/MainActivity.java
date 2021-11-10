package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListData[] listDataArray = new ListData[]{

                new ListData(getString(R.string.calc_title),
                        getString(R.string.calc_short_desc),
                        R.drawable.ic_baseline_calculate_24, ProjectActivity.class,
                        photoArray(0), getString(R.string.calc_full_desc)),

                new ListData(getString(R.string.restaurant_title),
                        getString(R.string.restaurant_short_desc),
                        R.drawable.ic_baseline_restaurant_menu_24, ProjectActivity.class,
                        photoArray(1), getString(R.string.placeholder_text)),

                new ListData(getString(R.string.bmi_title),
                        getString(R.string.bmi_short_desc),
                        R.drawable.bmi_icon_48x48, ProjectActivity.class,
                        photoArray(2), getString(R.string.placeholder_text)),

                new ListData(getString(R.string.notepad_title),
                        getString(R.string.notepad_short_desc),
                        R.drawable.my_notepad_icon, ProjectActivity.class,
                        photoArray(3), getString(R.string.placeholder_text))
        };

        RecyclerView list = findViewById(R.id.recycler_list);
        CustomAdapter adapter = new CustomAdapter(listDataArray, MainActivity.this);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);



    }


    public int[] photoArray(int id){

        int[] sliderImageId;

        switch(id){

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
}