package javapractice.runnablepractice;


public class Onion implements Ingredients{

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
