package javapractice.runnablepractice;

public class Tomato implements Ingredients{
    public String name;

    public Tomato(String name){
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name;
    }

    public Pieces cut(){
        return new Pieces(name);
    }

}
