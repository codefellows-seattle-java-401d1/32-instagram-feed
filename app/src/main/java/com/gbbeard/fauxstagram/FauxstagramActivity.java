package com.gbbeard.fauxstagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FauxstagramActivity extends AppCompatActivity {
    @BindView(R.id.recycler) public RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private FauxstagramAdapter mFauxstagramAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fauxstagram_feed);

        ButterKnife.bind(this);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mFauxstagramAdapter = new FauxstagramAdapter(FauxstagramData.feedProvider);
        mRecyclerView.setAdapter(mFauxstagramAdapter);
    }
}
