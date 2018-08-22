package com.example.instagram_feed;

import java.util.ArrayList;
import java.util.List;

public class InstagramPostData {
    public static final List<InstagramPost> animalProvider = new ArrayList<>();
    static {
        animalProvider.add(new InstagramPost("betterThanTrashPandas", "The world's only brown panda", "https://i.imgur.com/0366DUS.jpg"));
        animalProvider.add(new InstagramPost("xXxplumpTrashPandaxXx", "A truly majestic round trash panda", "https://i.imgur.com/B5FcIac.jpg"));
        animalProvider.add(new InstagramPost("pandaJusticeGundam", "Panda Gundam best gundam", "https://i.imgur.com/rRJuzYZ.jpg"));
        animalProvider.add(new InstagramPost("trollingTrashPanda", "Insecure white girls on facebook hate him", "https://i.imgur.com/GTyU9vS.jpg"));
        animalProvider.add(new InstagramPost("baeselfie", "Selfie Panda", "https://i.imgur.com/zrGKCzY.jpg"));
    }
}
