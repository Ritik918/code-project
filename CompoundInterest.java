package challenges;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the principle amount :");
        int principle = input.nextInt();

        System.out.print("enter the rate of interest :");
        float rate = input.nextFloat();

        System.out.print("enter the years of interest :");
        float years = input.nextFloat();

        double compound = principle * Math.pow((1 + rate / 100), years);


        System.out.println("the value of compound interest is RS :");
        System.out.println(compound);

        
        






    }
    
}
