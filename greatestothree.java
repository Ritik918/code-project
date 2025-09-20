package challenges;

import java.util.Scanner;

public class greatestothree {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter  first number :");
        int num1 = input.nextInt();
        System.out.print("enter  second number :");
        int num2 = input.nextInt();
        System.out.print("enter  third number :");
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("num1 is greater");
        }
        else if(num2 >= num3 && num2 >= num1 ) {
            System.out.print("num2 is greater");
        }
        else{
            System.out.println("num3 is greater");
        }

    }
    
}
