package javapractice.runnable;

public class TomatoPiece implements Pieces {
    private final int id;

    public TomatoPiece(int id) {
        this.id = id;
    }

    @Override
    public String description() {
        return "Tomato piece " + this.id;
    }
}

