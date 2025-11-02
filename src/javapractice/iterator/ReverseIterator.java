package javapractice.iterator;

public class ReverseIterator implements Iterator{

    private final PlayList playList;
    private int currentIndex;

    public ReverseIterator(PlayList playList) {
        this.playList = playList;
        this.currentIndex = playList.getSongList().size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Song next() {
        return playList.getSongList().get(currentIndex--);
    }
}
