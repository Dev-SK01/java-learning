import java.util.Scanner; //importing Scanner for keyoard input.

public class MyScanner {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Enter Number 1: ");
            a = console.nextInt();
            System.out.println("Enter Number 2: ");
            b = console.nextInt();
        }
        c = a + b;
        System.out.println("Sum : " + c);
    }
}