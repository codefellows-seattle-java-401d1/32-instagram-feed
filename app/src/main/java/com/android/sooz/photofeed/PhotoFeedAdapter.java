package com.android.sooz.photofeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;

public class PhotoFeedAdapter extends RecyclerView.Adapter<PhotoFeedAdapter.MyViewHolder>{

    private List<PhotoPost> mFeed;

    public PhotoFeedAdapter() {
        mFeed = new ArrayList<>();
    }

    public PhotoFeedAdapter(List<PhotoPost> feed){
        mFeed = feed;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.photo_feed_item, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder, int position) {
        PhotoPost post = mFeed.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount(){
        return mFeed.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        View mView;

        public ImageView mImage;
        public TextView mAuthor;
        public TextView mDescription;

        private PhotoPost mPost;

        public MyViewHolder(View view){
            super(view);
            mView = view;

            mImage = view.findViewById(R.id.image);
            mAuthor = view.findViewById(R.id.author);
            mDescription = view.findViewById(R.id.description);
        }

        public void bind(PhotoPost post){
            mPost = post;

            mAuthor.setText(post.author);
            mDescription.setText(post.description);

            Ion.with(mImage)
                    //placeholder method crashes this app - keeping for
                    //future investigation
//                    .placeholder(R.drawable.placeholder)
                    .error(R.drawable.error)
                    .load(mPost.imageURL);
        }
    }
}
