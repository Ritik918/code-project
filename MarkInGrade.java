package challenges;

import java.util.Scanner;

public class MarkInGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your percentage :");
        float percentage = input.nextFloat();

        if(percentage > 90) {
            System.out.println("student  have got A grade");

        }
        else if(percentage >= 75){
            System.out.println("student  have get B grade");

        }
        else if(percentage >= 60){
            System.out.println("student have get C grade");
        }
        else if(percentage >= 30){
            System.out.println("student have D grade");
        }
        else {
            System.out.println("student have fail");
        }




    }
}
