package challenges;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE FIBONACCI SERIES\n");
        System.out.print("Please enter your element to be printed :");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print(Recursion(i)  + "  ");
        }
    }



    public static int Recursion(int position){
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return Recursion(position - 1) + Recursion(position - 2);
    }
}
