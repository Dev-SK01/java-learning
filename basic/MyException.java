public class MyException {

    void myException () throws Exception{
        throw new Exception("Dummy Exception");
    }

    void handledException(){
        try{
            myException();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("rest of the code...");
        }
        finally{
            System.out.println("finally block executed.");
        }
    }
    public static void main(String[] args) {
        try{
            int num = 10/0;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("java error finally executed.");
        }
        MyException obj = new MyException();
        obj.handledException();
    }
}