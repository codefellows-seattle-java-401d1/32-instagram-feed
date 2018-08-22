package com.gbbeard.fauxstagram;

import java.util.ArrayList;
import java.util.List;

class FauxstagramData {
    public static final List<FauxstagramPost> feedProvider = new ArrayList<>();
    static {
        feedProvider.add(new FauxstagramPost("CatPsychedelicMeowMeow", "Cool Shirt Brother", "https://i.imgur.com/JrKEbhX.jpg"));
        feedProvider.add(new FauxstagramPost("hippieCat420", "WildCat", "https://i.imgur.com/ZOsOEqu.gif"));
        feedProvider.add(new FauxstagramPost("hippieCat420", "When the Catnip hits hard", "https://i.imgur.com/lE8Zgsc.jpg"));
        feedProvider.add(new FauxstagramPost("CatMagicEveryDay", "Magic Trick", "https://i.imgur.com/YoUvS1W.jpg"));
        feedProvider.add(new FauxstagramPost("CatMagicEveryDay", "He's electric!", "https://i.imgur.com/Jo2jaAM.jpg"));
        feedProvider.add(new FauxstagramPost("CatMagicEveryDay", "Magic the Cat-hering", "https://i.imgur.com/a7YoNpc.jpg"));
        feedProvider.add(new FauxstagramPost("CatMagicEveryDay", "Off topic modular synth", "https://i.imgur.com/AqeKSo6.jpg"));
    }
}
