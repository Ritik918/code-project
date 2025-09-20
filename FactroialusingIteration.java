package challenges;

import java.util.Scanner;

public class FactroialusingIteration {
    
    // using iteration :

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the factorial");
        System.out.print("enter the number :");
        int num = input.nextInt();

        long factorial = 1;

        for( int i = 1; i <= num; i++){
            factorial= factorial * i;
        }
        System.out.println("factoral of " + num +" is :" + factorial);

    }

}


