package challenges;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the age :");
        int age = input.nextInt();

        if(age <= 13){
            System.out.println("you are child");
        }
        else if(age <= 25){
            System.out.println("you are teenage");
        }
        else if(age <= 60){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are senior citizen");

        }

    }
}
