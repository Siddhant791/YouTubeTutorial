package javapractice.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("In Iterator Main");

        List<Songs> favoriteSongs = new ArrayList<>();
        favoriteSongs.add(new Songs("Song A"));
        favoriteSongs.add(new Songs("Song B"));
        favoriteSongs.add(new Songs("Song C"));

        PlayList playList = new PlayList(favoriteSongs);

        Iterator linearIterator = new LinearIterator(playList);

        // factory Design pattern
        Iterator randomIterator = new RandomIterator(playList);

        System.out.println("Playing songs in linear order:");

        Player player = new Player();
        player.playSong(randomIterator);

        // Problem 1 -> client side everythying is visible
        // Problem 2 -> multiple modes are not supported
    }

}
