package com.gbbeard.fauxstagram;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    @BindView(R.id.image) ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        unsetImage();
        mButton = findViewById(R.id.fauxstagram);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FauxstagramActivity.class);
                startActivity(intent);
            }
        });
    }

    @OnClick(R.id.unset)
    public void unsetImage() {
        Drawable loading = getResources().getDrawable(R.drawable.loading);
        mImageView.setImageDrawable(loading);
    }

    @OnClick(R.id.unsetWithIon)
    public void unsetImageWithIon() {
        // URI creation scheme found via StackOverflow
        // https://stackoverflow.com/a/27681417
        int id = R.drawable.loading;
        Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(id) +
                '/' + getResources().getResourceTypeName(id) +
                '/' + getResources().getResourceEntryName(id));

        Ion.with(mImageView)
                .load(imageUri.toString());
    }

    @OnClick(R.id.loadImage)
    public void loadImage() {
        String url = "https://i.imgur.com/NqU6fUY.jpg";
        Uri uri = Uri.parse(url);

        Ion.with(this)
                .load(uri.toString())
                .withBitmap()
                .placeholder(R.drawable.loading)
                .error(R.drawable.placeholder)
                .intoImageView(mImageView);
    }
}
