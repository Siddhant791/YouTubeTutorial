package javapractice.iterator;

import javapractice.iterator.factory.IteratorFactory;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("In Iterator Main");

        List<Songs> favoriteSongs = new ArrayList<>();
        favoriteSongs.add(new Songs("Song A"));
        favoriteSongs.add(new Songs("Song B"));
        favoriteSongs.add(new Songs("Song C"));

        //register the iterators
        IteratorFactory.register("LINEAR", (pl) -> new LinearIterator(pl) );
        IteratorFactory.register("RANDOM", (pl) -> new RandomIterator(pl) );
        IteratorFactory.register("REVERSE", (pl) -> new ReverseIterator(pl) );


        PlayList playList = new PlayList(favoriteSongs);

        String input = "LINEAR";

        Iterator linearIterator = IteratorFactory.get(input, playList);

        input = "RANDOM";

        // factory Design pattern
        Iterator randomIterator = IteratorFactory.get(input, playList);

        System.out.println("Playing songs in linear order:");

        Player player = new Player();
        player.playSong(linearIterator);

//        System.out.println("\nPlaying songs in random order:");
//        player.playSong(randomIterator);

        Iterator reverseIterator = IteratorFactory.get("REVERSE", playList);

        System.out.println("Playing Songs in reverse order");
        player.playSong(reverseIterator);

        // Problem 1 -> client side everythying is visible
        // Problem 2 -> multiple modes are not supported
    }

//    Function<PlayList,Iterator> linearFunction = (pl) -> new LinearIterator(pl);
//    Function<PlayList,Iterator> randomFunction = (pl) -> new RandomIterator(pl);

//
//    public Iterator getRandomIterator(PlayList playList){
//        return new RandomIterator(playList);
//    }

}
