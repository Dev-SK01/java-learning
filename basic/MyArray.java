import java.util.ArrayList;
public class MyArray{
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        String [] states = new String[3];
        states[0] = "tn";
        states[1] = "kl";
        states[2] = "ap";
        System.out.println(states[2]);
        for(Integer i:numbers){
            System.out.println(i);
        }
        System.err.println("Array Methods");
        System.out.println("Length " + states.length);
        System.out.println("Array List");

        ArrayList<String> city = new ArrayList<>();
        city.add("svga");
        city.add("rmd");
        System.out.println(city.get(0));
        city.set(1,"rmm");
        System.out.println(city);
    }
}