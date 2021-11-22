package com.example.portfoliolucasalmi;

import android.content.Context;

public class ObjectGenerator {

    public static ListData[] arrayGenerator(Context context) {

        ListData[] listDataArray = new ListData[]{

                new ListData(context.getString(R.string.calc_title),
                        context.getString(R.string.calc_short_desc),
                        R.drawable.ic_baseline_calculate_24, ProjectActivity.class,
                        ResourceManager.photoArray(0), context.getString(R.string.calc_full_desc), ResourceManager.linkMaker(0, context)),

                new ListData(context.getString(R.string.restaurant_title),
                        context.getString(R.string.restaurant_short_desc),
                        R.drawable.ic_baseline_restaurant_menu_24, ProjectActivity.class,
                        ResourceManager.photoArray(1), context.getString(R.string.restaurant_full_desc), ResourceManager.linkMaker(1, context)),

                new ListData(context.getString(R.string.bmi_title),
                        context.getString(R.string.bmi_short_desc),
                        R.drawable.bmi_icon_48x48, ProjectActivity.class,
                        ResourceManager.photoArray(2), context.getString(R.string.bmi_full_desc), ResourceManager.linkMaker(2, context)),

                new ListData(context.getString(R.string.notepad_title),
                        context.getString(R.string.notepad_short_desc),
                        R.drawable.my_notepad_icon, ProjectActivity.class,
                        ResourceManager.photoArray(3), context.getString(R.string.notepad_full_desc), ResourceManager.linkMaker(3, context)),

                new ListData(context.getString(R.string.kotlin_calc_title),
                        context.getString(R.string.kotlin_calc_short_desc),
                        R.drawable.ic_baseline_calculate_24, ProjectActivity.class,
                        ResourceManager.photoArray(4), context.getString(R.string.kotlin_calc_full_desc), ResourceManager.linkMaker(4, context))


        };

        return listDataArray;
    }
}
