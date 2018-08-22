package com.example.instagramlikefeed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recycler)
    public RecyclerView mRecyclerView;
    public LinearLayoutManager mLinearLayoutManager;
    public InstagramAdapter mInstagramAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        List<InstagramPost> posts = new ArrayList<>();
        posts.add(new InstagramPost("cute emergency", "Who said baby pigs aren't cute?", "https://scontent-sea1-1.cdninstagram.com/vp/1347c9d9c0ddafd33f824651c76e6a47/5C043410/t51.2885-15/e35/36769689_2072807719637431_1069370024034041856_n.jpg"));
        posts.add(new InstagramPost("cute emergency", "Proof all ", "https://scontent-sea1-1.cdninstagram.com/vp/fd6ce8c0a8f19bc6a5b11b1ec8073e4f/5BF77AC2/t51.2885-15/e35/29415375_395403574265790_8734239299802759168_n.jpg"));
        posts.add(new InstagramPost("cute emergency", "Mood", "https://scontent-sea1-1.cdninstagram.com/vp/6ab6dd3762b599525b315915c3786d57/5BF9C1E9/t51.2885-15/e35/18160497_118633375358572_1463406756313956352_n.jpg"));
        posts.add(new InstagramPost("cute emergency", "Fluff ball", "https://scontent-sea1-1.cdninstagram.com/vp/7795aac7fd258424877e0ae835047f8c/5C159B1C/t51.2885-15/e35/14368959_229121470871671_1234684401883807744_n.jpg"));
        posts.add(new InstagramPost("cute emergency", "Baby alpacas look like stuffed animals.", "https://scontent-sea1-1.cdninstagram.com/vp/8fb52da2c4d5fb499fbf7fabf2b7afe1/5BFCACF2/t51.2885-15/e35/29400585_568197570214696_8844251167648120832_n.jpg"));


        mInstagramAdapter = new InstagramAdapter(posts);
        mRecyclerView.setAdapter(mInstagramAdapter);
    }
}
