package challenges;

import java.util.Scanner;

public class userinputArithmetic1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number 1:");
        int a = input.nextInt();
        System.out.print("enter the number 2:");
        int b = input.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.print("the addition of these number is:");
        System.out.println(sum);

         System.out.print("the subraction of these number is:");
        System.out.println(sub);

         System.out.print("the multiplication of these number is:");
        System.out.println(mul);

         System.out.print("the division of these number is:");
        System.out.println(div);

         System.out.print("the modulus of these number is:");
        System.out.println(mod);




        
    }
}
