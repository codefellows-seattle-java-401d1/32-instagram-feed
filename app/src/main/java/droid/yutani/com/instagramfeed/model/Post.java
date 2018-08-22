package droid.yutani.com.instagramfeed.model;

public class Post {
    public String imageUrl;
    public String name;
    public String location;
    public String desc;

    public Post(String imageUrl, String name, String location, String desc) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.location = location;
        this.desc = desc;
    }
}
