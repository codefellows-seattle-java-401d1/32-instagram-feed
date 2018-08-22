package droid.yutani.com.instagramfeed.model;

public class Post {
    public String imageUrl;
    public String owner;
    public String location;
    public String desc;

    public Post(String imageUrl, String owner, String location, String desc) {
        this.imageUrl = imageUrl;
        this.owner = owner;
        this.location = location;
        this.desc = desc;
    }
}
