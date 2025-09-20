package challenges;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE FACTORIAL GENERSTOR \n");
        System.out.print("Please enter your number :");
        int num = input.nextInt(); 
        long fact = factorial(num);
        //long fac = simpleFactorial(num);
        System.out.println("Factorial of your number is :" + fact);
    }
      // calling recursion
      public static long factorial(int num){
        System.out.println("Function call for :" + num);
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);
      }

      public static long simpleFactorial(int num){
        long result = 1;
        for(int i = 1; i <= num; i++){
            result = result * i;
        }
        return result;
      }


}
