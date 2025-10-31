package javapractice.iterator;

import java.util.List;

public class PlayList {
    List<Songs> songs;

    public PlayList(List<Songs> songs){
        this.songs = songs;
    }

    public List<Songs> getSongs() {
        return songs;
    }
}
