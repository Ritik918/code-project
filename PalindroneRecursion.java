package challenges;

import java.util.Scanner;

public class PalindroneRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO PALINDRONE CHECKER");
        System.out.print("enter the string to be checked: ");
        String str = input.next();
        System.out.println("your string is " + (ispalindrone(str) ? "palindrone" : "not a pakindrone"));
    }
     
     public static boolean ispalindrone(String str){
        
        return false;
     }



}
