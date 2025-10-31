package javapractice.iterator;

import java.util.List;

public class RandomIterator implements Iterator{
    List<Songs> songsList;

    public RandomIterator(PlayList playList){
        songsList = playList.getSongs();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Songs next() {
        int randomIndex = (int)(Math.random() * songsList.size());
        return songsList.get(randomIndex);
    }
}
