package challenges;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();
         System.out.println("here is the fibonacci series");
         fibonacciseries(num);
    }



    public static void fibonacciseries(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while(first + second <=num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }
}
