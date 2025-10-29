package javapractice.runnable;

public class Pieces {
    public String name;

    public Pieces(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pieces{" +
                "name='" + name + '\'' +
                '}';
    }
}
