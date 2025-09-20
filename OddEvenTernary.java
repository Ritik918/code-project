package challenges;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("WELCOME TO THE ODD OR EVEN NUMBER CHECKER ");
         System.out.print("Please enter the number :");
         int num = input.nextInt();
         String result = num % 2 == 0 ? "even" : "odd";
         System.out.println("your number is: " + result);
    }
    
}
