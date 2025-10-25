package javapractice.runnable;

public class OnionPiece implements Pieces {
    private final int id;

    public OnionPiece(int id) {
        this.id = id;
    }


    @Override
    public String description() {
        return "Onion piece " + this.id;
    }

    @Override
    public String toString() {
        return "OnionPiece{" +
                "id=" + id +
                '}';
    }
}
