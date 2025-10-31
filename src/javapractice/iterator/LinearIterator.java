package javapractice.iterator;

import java.util.List;

public class LinearIterator implements Iterator{

    List<Songs> songs;
    int currentIndex;

    public LinearIterator(PlayList playList){
        songs = playList.getSongs();
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < songs.size();
    }

    @Override
    public Songs next() {
        return songs.get(currentIndex++);
    }
}
