package javapractice.iterator;

import java.util.ArrayList;
import java.util.List;

public class RandomIterator implements Iterator{
    private final List<Song> songList;

    public RandomIterator(PlayList playList) {
        this.songList = playList.getSongList();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Song next() {

        int randomIndex;
        randomIndex = (int) (Math.random() * songList.size());

        return songList.get(randomIndex);
    }

}
