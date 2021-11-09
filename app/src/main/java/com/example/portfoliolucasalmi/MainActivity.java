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

                new ListData("Calculator App", "A simple calculator created as a group project", R.drawable.ic_baseline_calculate_24, CalculatorActivity.class),
                new ListData("Restaurant Menu", "An interactive menu for a restaurant", R.drawable.ic_baseline_restaurant_menu_24, RestaurantMenuActivity.class),
                new ListData("BMI Calculator", "An app to calculate the users BMI", R.drawable.bmi_icon_48x48, BmiCalculatorActivity.class),
                new ListData("My Notepad", "A notepad app with a shopping list function", R.drawable.my_notepad_icon, MyNotepadActivity.class)
        };

        RecyclerView list = findViewById(R.id.recycler_list);
        CustomAdapter adapter = new CustomAdapter(listDataArray, MainActivity.this);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);



    }
}