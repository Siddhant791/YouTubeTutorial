package javapractice.iterator;

public class Player {
    public void playSong(Iterator iterator) throws InterruptedException {
        while(iterator.hasNext()){
            Songs song = iterator.next();
            song.play();
        }
    }
}
