package javapractice.iterator;

public class Player {
    public void play(PlayList playList, String type) throws InterruptedException {
        Iterator iterator = playList.getIterator(type);
        while (iterator.hasNext()){
            iterator.next().play();
        }
    }
}
