package javapractice.runnable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tomato implements Ingredients{

    private boolean cut;
    private final List<Pieces> piecesList = new ArrayList<>();

    @Override
    public boolean isCut() {
        return this.cut;
    }

    @Override
    public List<Pieces> cut(int noOfPieces) {
        if (cut) {
            return Collections.unmodifiableList(piecesList);
        }

        System.out.println("Cutting Tomato in pieces");

        for (int i = 0; i<noOfPieces; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            piecesList.add(new TomatoPiece(i));
        }

        System.out.println("Tomato is cut");
        this.cut = true;
        return Collections.unmodifiableList(piecesList);

    }

    @Override
    public String name() {
        return "Tomato";
    }
}

