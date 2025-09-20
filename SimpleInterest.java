package challenges;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the principle amount :");
        int principle = input.nextInt();

        System.out.print("enter the time:");
        float time = input.nextFloat();

        System.out.print("enter the rate :");
        float rate = input.nextFloat();

       float interest =(principle* time * rate ) / 100;

      System.out.println("amount of simple interest is :");
      System.out.print(interest);



    }
}
