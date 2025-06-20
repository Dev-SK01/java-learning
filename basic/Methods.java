class Methods{
    // without argument
    void addition(){
        int a = 10;
        int b=10;
        int c=90;
        System.out.println("Sum :" + (a+b+c));
    }
   // with argument
    void sub(int a,int b){
        int c = a - b;
        System.out.println("Sub: " + c);
    }
    // with return type
    int multiply(int a,int b){
        return a * b;
    }
    public static void main(String[] args) {
        // object creation
        Methods caller = new Methods();
        caller.addition();
        caller.sub(10, 2);
        int res = caller.multiply(10, 100);
        System.out.println(res);
    }
}