package challenges;

import java.util.Scanner;

public class FactorialusingRecursion {
public static long factorial(int n){

if(n==0 || n==1)
return 1;
else
    return n* factorial(n - 1);
}





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();

        long result = factorial(num);

        System.out.println("factorial of " + num + " is :" + result);
         
    }
    
}
