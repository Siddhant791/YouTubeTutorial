package lld.chapter1;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    List<Integer> list = new LinkedList<>();

    public void add(Integer element){
        list.add(element);
    }

    public List<Integer> getList(){
        return this.list;
    }

    public MyIterator iterator(){
        return new MyLinkedListIterator(this.list);
    }
}
