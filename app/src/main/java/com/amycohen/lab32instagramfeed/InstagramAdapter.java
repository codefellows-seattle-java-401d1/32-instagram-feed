package com.amycohen.lab32instagramfeed;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.List;

public class InstagramAdapter extends RecyclerView.Adapter<InstagramAdapter.MyViewHolder>{

    public List<InstagramPost> mPosts;

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

    //This keeps track of one item in the list at a time
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public ImageView image;
        public TextView author;
        public TextView description;

        private InstagramPost mPost;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;

            image = itemView.findViewById(R.id.image);
            author = itemView.findViewById(R.id.author);
            description = itemView.findViewById(R.id.description);

        }

        public void bind(InstagramPost post) {
            mPost = post;
            author.setText(post.author);
            description.setText(post.description);

            Ion.with(image).load(post.imageURL);
        }
    }

}
