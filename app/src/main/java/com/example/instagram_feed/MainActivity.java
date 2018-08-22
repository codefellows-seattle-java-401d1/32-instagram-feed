package com.example.instagram_feed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recycler)
    public RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private Adapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutmanager(mLinearLayoutManager);

        mAdapter = new Adapter(InstagramPostData.animalProvider);
        mRecyclerView.setAdapter(mAdapter);
    }
}
