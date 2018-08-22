package com.amycohen.lab32instagramfeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InstagramActivity extends AppCompatActivity {

    @BindView(R.id.list)
    public RecyclerView mRecyclerView;
    public LinearLayoutManager mLinearLayoutManager;
    public InstagramAdapter mInstagramAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        ButterKnife.bind(this);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        List<InstagramPost> posts = new ArrayList<>();
        posts.add(new InstagramPost("So Sew English", "Black Plaid Bundle", "https://imgur.com/FFYSnzg.jpg"));
        posts.add(new InstagramPost("So Sew English", "Ivory Stripe Rainbow Bundle", "https://imgur.com/N7mDRLV.jpg"));
        posts.add(new InstagramPost("So Sew English", "Jill Blue Plaid Bundle", "https://imgur.com/8h0rn5J.jpg"));
        posts.add(new InstagramPost("So Sew English", "Blue Mosaic ITY Bundle", "https://imgur.com/kdcQL6G.jpg"));
        posts.add(new InstagramPost("So Sew English", "Lemon Dot Bundle", "https://imgur.com/kWmSrxg.jpg"));
        posts.add(new InstagramPost("So Sew English", "Navy Paisley Bundle", "https://imgur.com/OSlSbsz.jpg"));
        posts.add(new InstagramPost("So Sew English", "Ruby Plaid Bundle", "https://imgur.com/y0jABFb.jpg"));
        posts.add(new InstagramPost("So Sew English", "Serenity Rainbow Bundle", "https://imgur.com/CdWtQx4.jpg"));

        mInstagramAdapter = new InstagramAdapter(posts);
        mRecyclerView.setAdapter(mInstagramAdapter);

    }
}
