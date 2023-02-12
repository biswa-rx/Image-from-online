package com.example.imagefromonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView2);

        Picasso.get().load("https://live.staticflickr.com/65535/50203707843_1b0e19cc6b_b.jpg").placeholder(R.drawable.avatar).into(img1);
        Picasso.get().load("https://cdn.stocksnap.io/img-thumbs/960w/food-burger_WYL5KWIPUD.jpg").placeholder(R.drawable.avatar).into(img2);
    }
}