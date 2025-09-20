package challenges;

import java.util.Scanner;

public class AbsoulteTernary {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("WELCOME TO ABSOLUTE VALue\n");
       System.out.print("Please enter the number:");
       int num = input.nextInt();
       int result = num >= 0 ? num : -num;
       System.out.println("Absolute value is :" + result);
    }
}
