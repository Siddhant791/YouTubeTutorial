package javapractice.iterator;

import java.util.*;
import java.util.function.Function;

public class IteratorMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Iterator main");

        List<Song> playlist = new ArrayList<>();

        playlist.add(new Song("Song 1"));
        playlist.add(new Song("Song 2"));
        playlist.add(new Song("Song 3"));
        playlist.add(new Song("Song 4"));

        PlayList playList = new PlayList(playlist);
        Player player = new Player();

        Iterator linear = new LinearIterator(playList);
        player.play(linear);

        List<Song> favouriteList = new ArrayList<>();
        favouriteList.add(new Song("Favourite 1"));
        favouriteList.add(new Song("Favourite 2"));
        favouriteList.add(new Song("Favourite 3"));
        favouriteList.add(new Song("Favourite 4"));

        PlayList favouritePlayList = new PlayList(favouriteList);
        Iterator random = new RandomIterator(favouriteList);
        player.play(random);



//        playList.playLinear();

    }
}
