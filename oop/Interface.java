interface InterfaceOne {
    void methodOne();
    void methodTwo();
}

class Interface implements InterfaceOne{
    public void methodOne(){
        System.out.println("I'm Interface implemented methodOne");
    }
    public void methodTwo(){
        System.out.println("I'm Interface implemented methodTwo");
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.methodOne();
        obj.methodTwo();
    }
}