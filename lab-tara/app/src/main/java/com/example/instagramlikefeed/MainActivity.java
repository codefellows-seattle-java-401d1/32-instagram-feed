package com.example.instagramlikefeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recycler)
    public RecyclerView mRecyclerView;
    public LinearLayoutManager mLinearLayoutManager;
    public InstagramAdapter mInstagramAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mInstagramAdapter = new InstagramAdapter();
        mRecyclerView.setAdapter(mInstagramAdapter);
    }
}
