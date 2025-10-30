package javapractice.iterator;

import java.util.List;

public class LinearIterator implements Iterator{

    private final List<Song> songList;
    int currentIndex;

    public LinearIterator(List<Song> songList){
        this.songList = songList;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < songList.size();
    }

    @Override
    public Song next() {
        return songList.get(currentIndex++);
    }
}
