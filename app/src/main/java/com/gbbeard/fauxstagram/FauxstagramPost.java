package com.gbbeard.fauxstagram;

class FauxstagramPost {
    public String user;
    public String imageUrl;
    public String description;

    public FauxstagramPost(String user, String description, String url) {
        this.user = user;
        this.description = description;
        this.imageUrl = url;
    }
}
