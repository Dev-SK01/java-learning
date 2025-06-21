import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class emp implements Serializable{
    String eid;
    String ename;

    emp(String eid ,String ename){
        this.eid = eid;
        this.ename=ename;
    }
}

class SerDe {
    public static void main(String[] args) {
        emp obj = new emp("1","devsk");
        try{
            // serilization
            FileOutputStream fileOp = new FileOutputStream("D:\\stream.txt");
            ObjectOutputStream stream = new ObjectOutputStream(fileOp);
            stream.writeObject(obj);
            stream.flush();
            stream.close();
            System.out.println("Serialized.");

            // de serilization

            FileInputStream fileIn = new FileInputStream("D:\\stream.txt");
            ObjectInputStream streamIn = new ObjectInputStream(fileIn);
            emp deser = (emp)streamIn.readObject();
            System.out.println(deser.eid + "," + deser.ename);
            streamIn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}