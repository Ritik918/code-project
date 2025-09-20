package challenges;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number :");
        int num1 = input.nextInt();
        System.out.print("enter the second number :");
        int num2 = input.nextInt();

        int gcd = findGCD(num1,num2);
        int lcm = (num1 * num2) / gcd;
        System.out.println("LCM of" + num1 +" and " + num2 + " is :" + lcm);
        


       
    }
    public static int findGCD(int a, int b){
        while(b!=0){
            int temp =b;
            b = a % b;
            a= temp;
        }
        return a;
    }
}
