package com.android.sooz.photofeed;

import java.util.ArrayList;
import java.util.List;

public class PhotoData {

    //list that holds all items
    public static final List<PhotoPost> apartmentcats = new ArrayList<>();

    //construction of all items (future in database)
    static {
        apartmentcats.add(new PhotoPost("https://scontent-sea1-1.cdninstagram.com/vp/9edd1a1b924db0c752e153fb155bb6d5/5C067AE9/t51.2885-15/sh0.08/e35/s640x640/35989474_703246733354438_4109826356974452736_n.jpg", "apartment_cats", "stop with the computer already"));
        apartmentcats.add(new PhotoPost("https://scontent-sea1-1.cdninstagram.com/vp/bd8f496a989dedbd23d97e488b72ee2d/5C359C5B/t51.2885-15/e35/36135822_242052159733935_7539744216872648704_n.jpg", "apartment_cats", "caturday cuddles"));
        apartmentcats.add(new PhotoPost("https://scontent-sea1-1.cdninstagram.com/vp/fe30eebd08acdf6d365119f88b3951ba/5BF5D233/t51.2885-15/e35/35575593_674519646235576_7783033902074953728_n.jpg", "apartment_cats", "shrimping perfection"));
        apartmentcats.add(new PhotoPost("https://scontent-sea1-1.cdninstagram.com/vp/96117514c17ea8a04287aa7f8f8f42e9/5C065511/t51.2885-15/sh0.08/e35/s640x640/36488094_356950404834855_5966515593476571136_n.jpg", "apartment_cats","Baby Harley: day one in his furever home"));
        apartmentcats.add(new PhotoPost("https://scontent-sea1-1.cdninstagram.com/vp/0bbeb815ad79e803fe0aea0428ed6af3/5C19AD5D/t51.2885-15/e35/34815243_240772573172129_2846774520734285824_n.jpg","apartment_cats","classic land orca derp"));
        apartmentcats.add(new PhotoPost("https://scontent-sea1-1.cdninstagram.com/vp/2862e6bcaca5e081978fd154616b7f1c/5C16D6C6/t51.2885-15/e35/32377750_255990518305118_2921482002219663360_n.jpg", "apartment_cats","Baby Ducati: week one in his furever home"));
    }

}
