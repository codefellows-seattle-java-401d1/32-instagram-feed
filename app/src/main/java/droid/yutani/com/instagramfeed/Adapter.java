package droid.yutani.com.instagramfeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;

import droid.yutani.com.instagramfeed.model.Post;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Post> mInstaFeed;

    public Adapter() {
        mInstaFeed = new ArrayList<>();
    }

    public Adapter(List<Post> feed) {
        mInstaFeed = feed;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup vg, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(vg.getContext());
        View view = inflater.inflate(R.layout.activity_picture, vg, false);

        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        Post post = mInstaFeed.get(i);
        myViewHolder.bind(post);
    }

    @Override
    public int getItemCount() {
        return mInstaFeed.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View mView;

        public ImageView mPic;
        public TextView mName;
        public TextView mLocation;
        public TextView mDesc;

        private Post mPost;

        public MyViewHolder(View view) {
            super(view);
            mView = view;

            mPic = view.findViewById(R.id.image);
            mName = mView.findViewById(R.id.name);
            mLocation = mView.findViewById(R.id.location);
            mDesc = mView.findViewById(R.id.desc);
        }

        public void bind(Post post) {
            mPost = post;
            mName.setText(post.name);
            mLocation.setText(post.location);
            mDesc.setText(post.desc);

            Ion.with(mPic)
                    .placeholder(R.drawable.placeholder)
                    .error(R.drawable.error_gif)
                    .load(mPost.imageUrl);
        }
    }
}
