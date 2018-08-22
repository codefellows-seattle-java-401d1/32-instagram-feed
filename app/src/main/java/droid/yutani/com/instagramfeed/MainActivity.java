package droid.yutani.com.instagramfeed;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.image_view)
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        loadImgs();
    }

    public void loadImgs() {
        String url = "https://www.thetimes.co.uk/imageserver/image/methode%2Ftimes%2Fprod%2Fweb%2Fbin%2F43d5eab0-3659-11e7-a950-1fd679d420f6.jpg?crop=5211%2C2931%2C206%2C76&resize=685";
        Ion.with(mImageView)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error_gif)
                .load(url);
    }


}
