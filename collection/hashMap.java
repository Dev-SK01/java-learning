package collection;
import java.util.*;
 
class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hMap = new  HashMap<Integer,String>();
        hMap.put(1,"Hello");
        hMap.put(2,"World");

        System.out.println("Iteratin hash map");
        for(Map.Entry m: hMap.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
