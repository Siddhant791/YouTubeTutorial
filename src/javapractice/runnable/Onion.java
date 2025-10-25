package javapractice.runnable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Onion implements Ingredients{

    private boolean cut;
    private final List<Pieces> piecesList = new ArrayList<>();

    @Override
    public boolean isCut() {
        return this.cut;
    }

    @Override
    public List<Pieces> cut(int noOfPieces) throws InterruptedException {
        if (cut) {
            return Collections.unmodifiableList(piecesList);
        }

        System.out.println("Cutting Onion in pieces");

        for (int i = 0; i<noOfPieces; i++){
            Thread.sleep(1000);
            piecesList.add(new OnionPiece(i));
        }

        System.out.println("Onion is cut");
        this.cut = true;
        return Collections.unmodifiableList(piecesList);

    }

    @Override
    public String name() {
        return "Onion";
    }

    @Override
    public String toString() {
        return "Onion{" +
                "cut=" + cut +
                ", piecesList=" + piecesList +
                '}';
    }
}
