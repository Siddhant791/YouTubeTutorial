package lld.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyListIterator implements MyIterator {
    private final List<Integer> list;
    private int currentIndex;

    public MyListIterator(List<Integer> list){
        this.list = new ArrayList<>(list);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        Integer element = list.get(currentIndex);
        currentIndex++;
        return element;
    }
}
