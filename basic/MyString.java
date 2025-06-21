public class MyString {
    static String str = "hello";
    static String str2 = "world";

    static public void print(String str){
        System.out.println(str);
    }

    static public void print(int str){
        System.out.println(str);
    }
    static public void print(String str[]){
        System.out.println(str);
    }
    public static void main(String[] args) {
        print(str.toLowerCase());
        print(str.length());
        print(str.concat(str2));
        print(str.concat(" "+str2));
        print(str.substring(0,3));
        print(str.concat(str2).substring(0,4));
        print(str.concat(str2).replace(str2, str));
        print(str.charAt(2));
        print(str.split(","));
        

    }
}
