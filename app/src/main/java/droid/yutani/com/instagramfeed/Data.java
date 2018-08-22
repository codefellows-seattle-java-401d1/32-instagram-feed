package droid.yutani.com.instagramfeed;

import java.util.ArrayList;
import java.util.List;

import droid.yutani.com.instagramfeed.model.Post;

public class Data {
    public static final List<Post> mountainList = new ArrayList<>();
    static {
        mountainList.add(new Post("https://www.thetimes.co.uk/imageserver/image/methode%2Ftimes%2Fprod%2Fweb%2Fbin%2F43d5eab0-3659-11e7-a950-1fd679d420f6.jpg?crop=5211%2C2931%2C206%2C76&resize=685", "K2", "Karakoram Range, Pakistan", "The second tallest mountain in the world standing at 8,611 metres(28,251 ft). K2 is known as the Savage Mountain due to the extreme difficulty of ascent. It has the second-highest fatality rate among the eight thousanders, with around 300 successful summits and 77 fatalities; about one person dies on the mountain for every four who reach the summit."));
        mountainList.add(new Post("https://static1.squarespace.com/static/52655a21e4b099d3af71eb0f/t/5658fb6ee4b0fad364e86f7e/1448672112386/014_20151107_D810_Fitzroy2_0202-Edit.jpg?format=750w", "Cerro Torre", "Patagonia, Argentina", "Cerro Torre (3,128 metres - 10,262ft) is famous not for its height but rather its foul weather, its very long pointed shape and difficult technical climbs. Because the Patagonian Ice Cap is located near it Pacific storms are lifted and focused through a geographic effect that drops lots of precipitation and adds power to the winds making them fearsome. Even the toughest of climbers have to take a hard long look deep inside before climbing in the conditions that Cerro Torre can dish out."));
        mountainList.add(new Post("http://www.alpinist.com/media/web17w/metanoia-1.jpg", "Eiger", "Bernese Alps, Switzerland", "The Eiger is a 3,967-metre (13,015 ft) mountain of the Bernese Alps, overlooking Grindelwald and Lauterbrunnen in the Bernese Oberland of Switzerland. he most notable feature of the Eiger is its 1,800-metre-high (5,900 ft) north face of rock and ice, named Eiger-Nordwand, Eigerwand or just Nordwand, which is the biggest north face in the Alps.[3] This huge face towers over the resort of Kleine Scheidegg at its base, on the homonymous pass connecting the two valleys."));
        mountainList.add(new Post("https://www.climbing.com/.image/t_share/MTUwNjM3NDk0ODA5OTI5Mzc3/mooses-tooth-camp_gn.jpg", "Moose's Tooth", "Alaska Range, USA", "One of the most iconic formations in North America, the Moose’s Tooth* tops out at 10,335 feet just east of the entrance to Alaska’s Ruth Gorge. The native Athabascan people, in their language, named the formation the Moose’s Tooth for its nearly mile-long, low-angle, east-to-west summit ridge resembling that part of a moose’s anatomy. It is a test piece for any aspiring Alpinist."));
        mountainList.add(new Post("http://1.bp.blogspot.com/-O4z3MKXc_XM/UeM_uWgMVaI/AAAAAAAADdY/pIsvFhComwI/s1600/193.JPG", "Alpamayo", "Cordillera Blanca, Peru", "19,511ft; Alpamayo is one of the most beautiful ice faces of the Andes. It is located more remotely than most other peaks in C. Blanca, as the hike to the BC takes 2-3 days (see below). In the first map of Cordillera Blanca from 1932 Alpamayo was not indicated at all! Eventually it was climbed for the first time in 1957 by a German expedition via the N ridge."));
    }
}
