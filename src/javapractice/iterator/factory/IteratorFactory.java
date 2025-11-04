package javapractice.iterator.factory;

import javapractice.iterator.Iterator;
import javapractice.iterator.LinearIterator;
import javapractice.iterator.PlayList;
import javapractice.iterator.RandomIterator;

public class IteratorFactory {

    public static Iterator get(String type, PlayList playList){

        if (type.equalsIgnoreCase("LINEAR")){
            return new LinearIterator(playList);
        } else if (type.equalsIgnoreCase("RANDOM")){
            return new RandomIterator(playList);
        }

        return null;
    }

}
