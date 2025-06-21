package fileHandling;
import java.io.FileReader;

public class Read {
  public static void main(String args[]){
    try{
        FileReader reader = new FileReader("D:\\out.txt");
        int i;
        while((i=reader.read()) !=-1){
            System.out.println((char)i);
        }
        reader.close();
    }catch(Exception e){
        System.out.println(e);
    }
  }
}
