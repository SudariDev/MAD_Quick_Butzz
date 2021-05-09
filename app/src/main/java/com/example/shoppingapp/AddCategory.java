package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AddCategory extends AppCompatActivity {

    private ImageView cloths , eloctrnic;
    private  ImageView weightloss ,beautycare;
    private ImageView personalCare, health;
    private String panel;
    private String CatNameAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);

    

        cloths = (ImageView)findViewById(R.id.cloths);
        eloctrnic = (ImageView)findViewById(R.id.eloctrnic);
         weightloss= (ImageView)findViewById(R.id.weightloss);
        beautycare = (ImageView)findViewById(R.id.beautycare);
        personalCare = (ImageView)findViewById(R.id.personal);
        health = (ImageView)findViewById(R.id.health) ;



        cloths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","cloths");
                startActivity(intent);
            }
        });

        personalCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","personalCare");
                startActivity(intent);
            }
        });

        eloctrnic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","electronic");
                startActivity(intent);
            }
        });

       weightloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","weightloss");
                startActivity(intent);
            }
        });

        beautycare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","beautycare");
                startActivity(intent);
            }
        });

        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","health");
                startActivity(intent);
            }
        });

        weightloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCategory.this, AddItem.class);
                intent.putExtra("category","weightloss");
                startActivity(intent);
            }
        });




    }
}