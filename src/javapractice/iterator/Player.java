package javapractice.iterator;

public class Player {
    public void play(Iterator iterator) throws InterruptedException {
        while (iterator.hasNext()){
            iterator.next().play();
        }
    }
}
