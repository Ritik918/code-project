package challenges;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = input.nextInt();
        boolean ispalindrone = ispalindrone(num);
        if(ispalindrone){
            System.out.println("your is palindrone");
        } else{
            System.out.println("your is not palindrne");
        }

    }
    public static boolean ispalindrone(int num){
       return num == reverse(num);
    }

    public static int reverse(int num){
        int newnum = 0;
        while(num>0){
             int digit = num % 10;
             newnum = newnum * 10 * digit;
             num  /= 10;
        }
        return newnum;
    }
    
}
