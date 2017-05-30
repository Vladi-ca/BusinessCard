package com.example.android.businesscard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Method defining the action after clicking the EXPLORE button

        //Method defining the action after clicking the box with the address of the company
        ImageView address = (ImageView) findViewById(R.id.address);
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.address_geo)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.map_toast, Toast.LENGTH_LONG).show();
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.map_toast_unable, Toast.LENGTH_LONG).show();
                }
            }
        });

        //Method when first number is clicked & phone app will open with the predefined number
        TextView numberOne = (TextView) findViewById(R.id.number_one);
        numberOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.number_one)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.number_one_unable, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when speaking bubble icon is opened & phone app will open with the predefined number
        TextView numberTwo = (TextView) findViewById(R.id.number_two);
        numberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.number_two)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.number_two_unable, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when email one is clicked, mail app will open with mail subject and text
        TextView mailOne = (TextView) findViewById(R.id.mail_one);
        mailOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.mail_to)));
                intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.mail_subject));
                intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.mail_text));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.mail_question, Toast.LENGTH_LONG).show();
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.mail_unable, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when email two is clicked, mail app will open with mail subject and text
        TextView mailTwo = (TextView) findViewById(R.id.mail_two);
        mailTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.mail2_to)));
                intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.mail2_subject));
                intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.mail_text));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.mail_question, Toast.LENGTH_LONG).show();
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.mail_unable, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when fb icon is clicked, facebook url will open
        ImageView fb = (ImageView) findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.url_fb)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.unable_fb, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when twitter icon is clicked, twitter url will open
        ImageView twitter = (ImageView) findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.url_twitter)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.unable_twitter, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when button is clicked, url will open
        Button explore  = (Button) findViewById(R.id.explore);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.url_button)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.unable_button, Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Method when mouse icon is clicked, linkedIn url will open
        ImageView web = (ImageView) findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getString(R.string.url_linkedin)));
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, R.string.unable_linkedin, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
