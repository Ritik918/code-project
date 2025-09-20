package challenges;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MY CALCUATOR\n");
        System.out.print("Please enter first number :");
        int num1 = input.nextInt();
        System.out.print("Please enter second number :");
        int num2 = input.nextInt(); 
        System.out.print("enter the operation :");
        String operation = input.next();

        int result = switch(operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "%" -> num1 % num2;
            default -> 0;
            
        };
        System.out.println("your answer is : " + result);

    }
}
