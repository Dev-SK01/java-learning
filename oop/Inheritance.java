
class VersionOne {
    public void AppLayout(){
        System.out.println("version one.");
        System.out.println("Red Layout color");

    }
}

public class Inheritance extends VersionOne{
    public void AppLayoutTwo(){
        System.out.println("version Two.");
        System.out.println("Blue color Layout");
    }
    public static void main (String args[]){
           Inheritance caller = new Inheritance();
           caller.AppLayout();
           caller.AppLayoutTwo();
    }
}