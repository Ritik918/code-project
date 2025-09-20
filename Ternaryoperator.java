package challenges;

import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER CHECKER");
        System.err.print("Please enter first number :");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number :");
        int num2 = input.nextInt();

        int greaterNumber = num1 > num2 ? num1 : num2 ; // ternary operator
        System.out.println(greaterNumber + " is the greater number");
    }
}
