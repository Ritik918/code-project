package challenges;

import java.util.Scanner;

public class SumofDigitofInteger {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();
        int sum = sumofdigit(num);
        System.out.println("sum of digits is :" + sum);


    
    }


    public static int sumofdigit(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num /= 10;

        }

        return sum;

    }
}


