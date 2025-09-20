package challenges;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("enter the base :");
        double base= input.nextDouble();
        System.err.print("enter the height :");
        double height = input.nextDouble();
        
        double area = (base * height) / 2;

        System.out.println("area of traingle :");
        System.out.print(area);
        
    }
}
