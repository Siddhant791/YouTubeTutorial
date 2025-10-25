package javapractice.runnable;

import java.util.List;

public interface Ingredients {
    boolean isCut();
    List<Pieces> cut(int noOfPieces) throws InterruptedException;
    String name();
}
