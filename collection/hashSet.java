package collection;

import java.util.*;

public class hashSet {
     public static void main(String args[]){
        HashSet<String> list = new HashSet<String>();
        list.add("hello");
        list.add("hello");
        System.out.println(list);
        list.remove("hello");
        //  iterating liked list.
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     }
}
