package javapractice.runnable;

public class Tomato implements Ingredient{
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
