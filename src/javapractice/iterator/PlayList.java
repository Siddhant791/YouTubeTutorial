package javapractice.iterator;

import java.util.List;

public class PlayList {
    List<Song> playList;

    public PlayList(List<Song> playList) {
        this.playList = playList;
    }

    public List<Song> getSongList() {
        return playList;
    }

//    public void playLinear() throws InterruptedException {
//        for (Song s: playList){
//            s.play();
//        }
//    }
//
//    public void playRandom() throws InterruptedException {
//        for (int i = 0; i < playList.size(); i++){
//            int randomIndex = (int) (Math.random() * playList.size());
//            Song s = playList.get(randomIndex);
//            s.play();
//        }
    // 1,2,3,4,5
    // 1,3,5,2,4

    // descecion point - always true
    // next song play -> index + 2

    // -> what's current song

//    }

//    public Iterator getIterator(String name){
//        if (name.equals("linear")){
//            return new LinearIterator(playList);
//        }
//        else if (name.equals("random")){
//            return new RandomIterator(playList);
//        }
//        else {
//            return null;
//        }
//
//    }
}
