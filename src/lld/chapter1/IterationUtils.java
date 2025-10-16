package lld.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterationUtils {
    public static void iterate(MyIterator iterator){
        while (iterator.hasNext()){
            System.out.println("Collection element printing is " + iterator.next());
        }
    }
}
