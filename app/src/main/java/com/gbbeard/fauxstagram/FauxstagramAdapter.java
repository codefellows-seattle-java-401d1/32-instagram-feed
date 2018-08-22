package com.gbbeard.fauxstagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;

class FauxstagramAdapter extends RecyclerView.Adapter<FauxstagramAdapter.MyViewHolder> {
    private List<FauxstagramPost> mFeed;

    public FauxstagramAdapter() {
        mFeed = new ArrayList<>();
    }

    public FauxstagramAdapter(List<FauxstagramPost> feed) {
        mFeed = feed;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.fauxstagram_feed_post, parent, false);

        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FauxstagramPost post = mFeed.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return mFeed.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View mView;

        public ImageView mImage;
        public TextView mAuthor;
        public TextView mDescription;

        private FauxstagramPost mPost;

        public MyViewHolder(View view) {
            super(view);
            mView = view;

            mImage = view.findViewById(R.id.image);
            mAuthor = view.findViewById(R.id.author);
            mDescription = view.findViewById(R.id.description);
        }

        public void bind(FauxstagramPost post) {
            mPost = post;
            mAuthor.setText(post.user);
            mDescription.setText(post.description);

            Ion.with(mImage)
                    .placeholder(R.drawable.loading)
                    .load(mPost.imageUrl);
        }
    }
}
