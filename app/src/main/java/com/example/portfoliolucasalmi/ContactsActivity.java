package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ContactsActivity extends AppCompatActivity {


    LinearLayout firstRow;
    LinearLayout secondRow;
    LinearLayout thirdRow;
    LinearLayout fourthRow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        firstRow = findViewById(R.id.first_row);
        secondRow = findViewById(R.id.second_row);
        thirdRow = findViewById(R.id.third_row);
        fourthRow = findViewById(R.id.fourth_row);

        setListeners();
    }

    public void setListeners(){


        firstRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse("https://github.com/LucaSalmi");
                Intent go = new Intent(Intent.ACTION_VIEW, link);
                startActivity(go);

            }
        });

        secondRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri mail = Uri.parse(getString(R.string.mail_sent_to));
                Intent go = new Intent(Intent.ACTION_VIEW, mail);

                try {
                    startActivity(go);

                }catch (ActivityNotFoundException e){

                    Toast.makeText(ContactsActivity.this, "No e-mail app present", Toast.LENGTH_LONG).show();
                }
            }
        });

        thirdRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri telephone = Uri.parse(getString(R.string.telephone));
                Intent go = new Intent(Intent.ACTION_DIAL, telephone);
                startActivity(go);

            }
        });

        fourthRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse("https://www.linkedin.com/in/luca-salmi-0a46ab21b/");
                Intent go = new Intent(Intent.ACTION_VIEW, link);
                startActivity(go);

            }
        });
    }
}