package javapractice.iterator;

public class Song {
    private final String name;

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() throws InterruptedException {
        System.out.println("Playing " + name);
        Thread.sleep(2000);
    }
}
