package challenges;

import java.util.Scanner;

public class ReverseTheDigitsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is " + reverse);
    }



    public static int reverse(int num){
        int newnum = 0;
        while(num > 0){
          int digit = num % 10;
          newnum = newnum * 10 + digit;
          num /= 10;
        }
        return newnum;

    }
}
