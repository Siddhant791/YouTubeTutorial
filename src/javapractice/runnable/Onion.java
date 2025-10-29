package javapractice.runnable;

public class Onion implements Ingredient{

    public String name;

    public Onion(String name){
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
