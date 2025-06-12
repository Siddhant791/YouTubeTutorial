package lld.chapter1;

public class IterationUtils {
    public static void iterate(MyIterator iterator){
        while (iterator.hasNext()){
            System.out.println("Collection element printing is " + iterator.next());
        }
    }
}
