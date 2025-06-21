package collection;
import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("hello");
        list.add("hello");
        System.out.println(list);
        list.add(2,"again");
        list.add(3,"hello");
        list.remove(0);
        list.remove("hello");
        //  iterating liked list.
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
