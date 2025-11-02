package javapractice.iterator;

import javapractice.iterator.factory.IteratorFactory;

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

//        Iterator linear = IteratorFactory.getIterator("LINEAR", playList);
//        player.play(linear);

        IteratorFactory.getIterator("LINEARg", playList)
                .ifPresentOrElse(it -> {
                    try {
                        player.play(it);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, () -> System.out.println("LINEAR iterator not available"));


        List<Song> favouriteList = new ArrayList<>();
        favouriteList.add(new Song("Favourite 1"));
        favouriteList.add(new Song("Favourite 2"));
        favouriteList.add(new Song("Favourite 3"));
        favouriteList.add(new Song("Favourite 4"));

        PlayList favouritePlayList = new PlayList(favouriteList);

        IteratorFactory.getIterator("REVERSE",favouritePlayList)
                .ifPresentOrElse(it -> {
                    try {
                        player.play(it);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, () -> {;
                    System.out.println("Invalid iterator type");
                });

        IteratorFactory.registerIterator("REVERSE", ReverseIterator::new);
        IteratorFactory.getIterator("reverse", playList)
                .ifPresentOrElse(
                        (it) -> {
                            try {
                                player.play(it);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        } , () -> {
                            System.out.println("Reverse iterator not available");
                        }
                );
    }

//        playList.playLinear();

    }
