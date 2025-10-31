package javapractice.iterator;

public class Player {
    public void playSong(Iterator iterator){
        while(iterator.hasNext()){
            Songs song = iterator.next();
            song.play();
        }
    }
}
