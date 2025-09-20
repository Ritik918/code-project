package challenges;

import java.util.Scanner;


public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter temperature in F :");
        float fah = input.nextFloat();
        
        float cel = (fah - 32) * 5 / 9;
        System.out.println("calcuate the temperature is: ");
        System.out.print(cel + "C");

    }
}
