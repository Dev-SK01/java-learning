package fileHandling;
import java.io.FileWriter;

class Writter {
   public static void main(String[] args) {
     try{
      FileWriter write = new FileWriter("D:\\out.txt");
       write.write("Hello World!");
       write.close();
       System.out.println("Successfull.");
    }catch(Exception e){
        System.out.println(e);
    }
   }
}