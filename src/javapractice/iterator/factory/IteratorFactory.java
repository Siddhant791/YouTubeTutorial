package javapractice.iterator.factory;

import javapractice.iterator.Iterator;
import javapractice.iterator.LinearIterator;
import javapractice.iterator.PlayList;
import javapractice.iterator.RandomIterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class IteratorFactory {

    public static Map<String, Function<PlayList,Iterator>> iteratorMap = new HashMap<>();

    static {
        // initialize the map with iterator types and their corresponding constructors
        iteratorMap.put("LINEAR", LinearIterator::new);
        iteratorMap.put("RANDOM", RandomIterator::new);
    }

    public static Optional<Iterator> getIterator(String type, PlayList playList) {
        return iteratorMap.get(type.toUpperCase()) != null ?
                Optional.of(iteratorMap.get(type.toUpperCase()).apply(playList)) :
                Optional.empty();
    }

    public static void registerIterator(String type , Function<PlayList, Iterator> newIteratorFunction){
            iteratorMap.put(type, newIteratorFunction);
    }
}
