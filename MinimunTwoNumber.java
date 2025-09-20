package challenges;

import java.util.Scanner;

public class MinimunTwoNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER CHECKER");
        System.out.print("please enter the first number :");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number :");
        int num2 = input.nextInt();
         MinimunTwoNumber terary = new MinimunTwoNumber();
         int minimunNumber = terary.minimunNumber(num1 , num2);
         System.out.println("Minimun number is :" + minimunNumber);

      
    }
    public int minimunNumber(int num1, int num2){
        return num1 < num2 ? num1 :num2;
       // if(num1 < num2){
            
         //   return num1;
        //} else{
         //   return num2;
       // }
        
    }
}
