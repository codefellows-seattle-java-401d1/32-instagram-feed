package com.example.instagramlikefeed;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

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
        InstagramPost post = mPosts.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public View mView;

        public ImageView image;
        public TextView author;
        public TextView description;

        private InstagramPost mPost;

        public MyViewHolder(@NonNull View view) {
            super(view);
            mView = view;

            author = view.findViewById(R.id.author);
            description = view.findViewById(R.id.description);
            image = view.findViewById(R.id.image);
        }

        public void bind(InstagramPost post) {
            mPost = post;

            author.setText(post.author);
            description.setText(post.description);
            Ion.with(image).load(post.imageUrl);
        }
    }

}
