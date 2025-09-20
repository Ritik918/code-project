package challenges;

import java.util.Scanner;

public class UsingForLoopForPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE NUMBER CHECKER\n");
        System.out.print("Please enter the number :");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        System.out.println("your number is " + (isprime(num) ? "prime" : "not prime"));
        
    }

    public static boolean isprime(int num){
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                return false;
            }
            
        }
        return true;
    }
}
