package com.example.joshy.mystreamer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = this;
        setContentView(R.layout.activity_main);
        mImageView = (ImageView)findViewById(R.id.image_view);
        mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(mImageView);

    }
}
