package javapractice.iterator;

public class Songs {
    public String title;

    public Songs(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "title='" + title + '\'' +
                '}';
    }

    public void play(){
        System.out.println("Playing song: " + title);
    }
}
