package lld.chapter1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("In Main method");
        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
//        myList.printAll();

        System.out.println("List is printed");

        //Stack
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("In Iteration mode");
        //Queue
        // [1 ,2 ,4]
        // checking whether the next element is present or not - hasNext();
        // if yes taking that next element and processing it - next();
        // if not then exit

        MyIterator it = myList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Iterating linked list");

        MyIterator it3 = linkedList.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
            break;
        }

        System.out.println("After ");

        MyIterator it2 = linkedList.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("After all");

        while(it3.hasNext()){
            System.out.println(it3.next());
        }





        MyLinkedList list2 = new MyLinkedList();
        list2.add(50);
        list2.add(45);
        list2.add(40);

        IterationUtils.iterate(list2.iterator());















    }
}
