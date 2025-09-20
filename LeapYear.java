package challenges;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the year you want :");
        int year = input.nextInt();

        if(year % 400 == 0){
            System.out.println("year is leap year ");

        }
        else if (year % 4 == 0 && year % 100 != 0 ){
            System.out.print("year is a leap year");
        }
        else {
            System.out.println("year is not a leap year");
        }

        
    }
}
