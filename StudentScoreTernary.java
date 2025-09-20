package challenges;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT SCORE\n");
        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();
        String category = marks > 80 ? "High" :(marks > 50 ? "Moderate" : "Low");
        System.out.println("your category is :" + category);
    }
}
