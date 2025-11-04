package javapractice.iterator;

public class ReverseIterator implements Iterator{

    private PlayList playList;
    private int currentIndex;

    public ReverseIterator(PlayList playList){
        this.playList = playList;
        this.currentIndex = playList.getSongs().size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Songs next() {
        return playList.getSongs().get(currentIndex--);
    }
}
