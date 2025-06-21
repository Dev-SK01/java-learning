abstract class class1{
    abstract void method();
    void methodTwo(){
        System.out.println("I'm not an  abstract method");
    }
}

class Abstraction extends class1{
     public void method(){
         System.out.println("I'm inherited class implemented method.");
     }

     public static void main(String[] args){
        Abstraction obj = new Abstraction();
        obj.method();
        obj.methodTwo();
     }
}