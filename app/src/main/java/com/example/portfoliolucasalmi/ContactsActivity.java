package com.example.portfoliolucasalmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ContactsActivity extends AppCompatActivity {

    ImageButton gitHub;
    ImageButton mail;
    ImageButton telephone;
    ImageButton linkedIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        gitHub = findViewById(R.id.gitHub_btn);
        mail = findViewById(R.id.mail_btn);
        telephone = findViewById(R.id.phone_btn);
        linkedIn = findViewById(R.id.linkedIn_btn);

        setListeners();
    }

    public void setListeners(){


        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse("https://github.com/LucaSalmi");
                Intent go = new Intent(Intent.ACTION_VIEW, link);
                startActivity(go);

            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
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

        telephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri telephone = Uri.parse(getString(R.string.telephone));
                Intent go = new Intent(Intent.ACTION_DIAL, telephone);
                startActivity(go);

            }
        });

        linkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse("https://www.linkedin.com/in/luca-salmi-0a46ab21b/");
                Intent go = new Intent(Intent.ACTION_VIEW, link);
                startActivity(go);

            }
        });
    }
}