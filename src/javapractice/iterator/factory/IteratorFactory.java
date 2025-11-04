package javapractice.iterator.factory;

import javapractice.iterator.Iterator;
import javapractice.iterator.LinearIterator;
import javapractice.iterator.PlayList;
import javapractice.iterator.RandomIterator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class IteratorFactory {

    private static Map<String, Function<PlayList,Iterator>> iteratorMap = new HashMap<>();

    public static Iterator get(String type, PlayList playList){
        Function<PlayList,Iterator> function = iteratorMap.get(type);
        return function.apply(playList);
    }

    public static void register(String type, Function<PlayList,Iterator> iteratorFunction){
        iteratorMap.put(type,iteratorFunction);
    }

    // register iterators
    // linear iterator register
    // random iterator register

    // get

}
