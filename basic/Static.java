class stat_Example {

    static String staticVarOne = "im static variable.";
    static final String finalVar = "I'm a final variable";

    static public void staticMethod(){
        System.out.println("I'm a static method");
    }
    protected void nonStaticMethod(){
        System.out.println("I'm a not static method.");
    }

    static{
        System.out.println("I'm static block.");
    }
}

class Static {
    public static void main(String[] args) {
        stat_Example obj = new stat_Example();
        // non static
        obj.nonStaticMethod();
        // static
        stat_Example.staticMethod();
        System.out.println(stat_Example.staticVarOne);
        System.out.println(stat_Example.finalVar);

    }
}