class thisExample {
    String varOne ;
    // class constructor
    thisExample(String name){
      this.varOne = name;
    }
    void print(){
        System.out.println(this.varOne);
    }
}

class fruit {
  String fruit= "apple";
}

class superExample extends fruit {
    void display(){
        System.out.println( "I'm parent Fruit: " + super.fruit);
    }
}
class ThisAndSuper extends superExample{
    
   public static void main(String[] args) {
    
     thisExample obj  = new thisExample("I'm this keyword");
     obj.print();

     superExample obj1 = new superExample();
     obj1.display();
   }
}