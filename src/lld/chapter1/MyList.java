package lld.chapter1;

import java.util.ArrayList;
import java.util.List;

public class MyList{
    private List<Integer> list = new ArrayList<>();
    private int currentIndex = 0;

    public void add(Integer element){
        list.add(element);
    }

    public List<Integer> getList(){
        return this.list;
    }

    public MyIterator iterator(){
        return new MyListIterator(this.list);
    }
}
