package com.example.instagramlikefeed;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.MyViewHolder>{
    private List<InstagramPost> mPosts;

    public InstagramAdapter(List<InstagramPost> posts) {
        mPosts = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.instagram_post, parent, false);

        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public View mView;

        public MyViewHolder(@NonNull View view) {
            super(view);
            mView = view;
        }
    }

}
