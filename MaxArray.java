package challenges;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println( "WELCOME TO FINDING THE MAXIMUM\n");
        int [] arr = ArrayUtility.inputarray();

        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(max <num){
                max = num;
            }
        }

        System.out.println("Maximum number is : " + max);
       
    }

    }
    
