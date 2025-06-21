 public class MyConstructor{
     MyConstructor(){
        System.out.println("I'm from default constructor.");
     }
     MyConstructor(int number){
        System.out.println("I'm number type constructor " + number);
     }
     MyConstructor(String str){
        System.out.println("I'm string type constructor " + str);
     }
     public void printArr(int arr []) {
        System.out.println(arr[0]);
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        MyConstructor obj = new MyConstructor(1);
        MyConstructor obj2 = new MyConstructor("hello!");
        obj.printArr(arr);
    }
 }