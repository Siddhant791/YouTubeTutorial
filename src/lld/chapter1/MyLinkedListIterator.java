package lld.chapter1;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListIterator implements MyIterator{

    private final List<Integer> list;
    private int currentIndex;

    public MyLinkedListIterator(List<Integer> list){
        this.list = new LinkedList<>(list);
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
