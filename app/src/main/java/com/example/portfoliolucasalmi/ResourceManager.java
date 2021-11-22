package com.example.portfoliolucasalmi;

import android.content.Context;

public class ResourceManager {

    public static int[] photoArray(int id) {

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

            case 4:

                sliderImageId = new int[]{

                        R.drawable.kotlin_calculator_screen_1,
                        R.drawable.kotlin_calculator_screen_2,
                        R.drawable.kotlin_calculator_screen_3,
                };
                break;
            default:
                sliderImageId = new int[]{
                };
                break;
        }

        return sliderImageId;
    }

    public static String linkMaker(int linkId, Context context) {

        String link;

        switch (linkId) {
            case 0:
                link = context.getString(R.string.calc_github_link);
                break;
            case 1:
                link = context.getString(R.string.rest_github_link);
                break;
            case 2:
                link = context.getString(R.string.bmi_github_link);
                break;
            case 3:
                link = context.getString(R.string.notepad_github_link);
                break;
            case 4:
                link = context.getString(R.string.kotlin_calc_github_link);
            default:
                link = context.getString(R.string.main_github_link);
                break;
        }
        return link;
    }
}
