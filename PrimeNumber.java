package challenges;
import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if(isprime){
            System.out.println("your number is prime number");
        }
        else{
           System.out.println("your number is not a prime number");
        }
    
    }
    public static boolean isprime(int num){

        int i = 2;
        while(i < num){
        if(num % i == 0){
            return false;
        }
        i++;

             }
             return true;
        
    }
    
}
