package com.example.android.userprofile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.picture);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(String.valueOf("Anna"));

        name.setTextSize(30);

        name.setTextColor(Color.parseColor("#000000"));


        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText(String.valueOf("01/01/1990"));

        birthday.setTextSize(20);

        birthday.setTypeface(null, Typeface.BOLD);

        TextView country = (TextView) findViewById(R.id.country);
        country.setText(String.valueOf("Poland"));

        country.setTextSize(20);

        country.setTypeface(null, Typeface.BOLD_ITALIC);

    }
}
