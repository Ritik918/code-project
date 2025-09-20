package challenges;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first side :");
        double a = input.nextDouble();

         System.out.print("enter second side :");
        double b = input.nextDouble();

         System.out.print("enter third side :");
        double c = input.nextDouble();

         System.out.print("enter fouth side :");
        double d = input.nextDouble();

        double perimeter = a + b + c + d;

        System.out.println("the perimeter of rectangle :");
        System.out.println(perimeter);

        
        
    }
}
