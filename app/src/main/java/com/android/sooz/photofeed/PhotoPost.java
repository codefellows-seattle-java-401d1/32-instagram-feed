package com.android.sooz.photofeed;

public class PhotoPost {

    //variables/properties
    public String imageURL;
    public String author;
    public String description;

    //constructor
    public PhotoPost(String imageURL, String author, String description) {
        this.imageURL = imageURL;
        this.author = author;
        this.description = description;
    }

}
