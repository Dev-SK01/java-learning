class methodOverLoading {

    public void methodOverLoadOne(){
         System.out.println("method one overloading");
    }
    public void methodOverLoadOne(String a){
         System.out.println("method one overloading " + a);
    }
    
}

class Polymorphism extends methodOverLoading {

     public void methodOverLoadOne(){
        System.out.println("I'm a over rided method");
     }
    public static void main(String[] args){
        Polymorphism obj = new Polymorphism();
        obj.methodOverLoadOne();
        obj.methodOverLoadOne("hello");
    }
}
