package com.android.sooz.photofeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_list)
    public RecyclerView mRecyclerView;
    public LinearLayoutManager mLinearLayoutManager;
    public PhotoFeedAdapter mPhotoFeedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLinearLayoutManager = new LinearLayoutManager(this );
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mPhotoFeedAdapter = new PhotoFeedAdapter(PhotoData.apartmentcats);
        mRecyclerView.setAdapter(mPhotoFeedAdapter);

    }
}
