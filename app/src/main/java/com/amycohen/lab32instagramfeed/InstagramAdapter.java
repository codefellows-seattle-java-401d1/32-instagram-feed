package com.amycohen.lab32instagramfeed;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.MyViewHolder>{

    public List<InstagramPost> mPosts;
    public InstagramAdapter(List<InstagramPost> posts) {

        mPosts = posts;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public View mView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
