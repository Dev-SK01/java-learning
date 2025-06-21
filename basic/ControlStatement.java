public class ControlStatement {
    public static void main(String[] args){
        int num = 100;
        String arr[] = {"elem1","elem2"};
        int num2 = 2;
        int flag = 0;

        // if statement
        if(num <= 100 && num >= 100 ){
             System.out.println("testing if");
             if(num >= 100) {
                System.out.println("testing nested if");
             }
        }else{
            System.out.println("teting else");
        }

        // switch statement
        switch(num) {
            case 101:
              System.out.println("Greater than 00");
              break;
            case 100:
              System.out.println("Number is 100");
              break;
            default:
             System.out.println("number");
             break;
        }

        // for loop
        for (int i=0;i <= 10;i++){
            System.out.println("value: " + i);
        }
        // for each 
        for (String string : arr) {
            System.out.println(string);
        }
        // while loop
        while (num2 <= 5) {
             System.out.println("Executing " + flag + " times");
             num2 ++;
             flag ++;
        }    
    }
}