package com.example.panos.panos_lab0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ImageData mImageData = ImageData.get();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ImageAdapter(mImageData.images());
        mRecyclerView.setAdapter(mAdapter);
    }
}
