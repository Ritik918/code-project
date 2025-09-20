package challenges;


import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1;i < num; i = i+2){
            sum = sum + i;
        }
        
               System.out.println("sum of odd number :"  + sum);
            
        


    }

}
