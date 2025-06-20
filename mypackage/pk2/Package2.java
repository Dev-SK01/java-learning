package mypackage.pk2;
import mypackage.pk1.Package1;

public class Package2 {
   public static void main(String[] args) {
      Package1 object = new Package1();
      // calling package 1 method
      object.method1();
   }
}
