package com.example.instagram_feed;

public class InstagramPost {
    public String author;
    public String description;
    public String imageUrl;

    public InstagramPost(String author, String description, String imageUrl) {
        this.author = author;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}
