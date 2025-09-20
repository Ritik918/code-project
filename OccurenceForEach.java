package challenges;

import java.util.Scanner;

public class OccurenceForEach {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("WELCOME TO THE FINDING OCCURENCE\n ");
       int [] nums = ArrayUtility.inputarray();
       System.out.print("Please enter the number you wantto search :");
       int num2 = input.nextInt();
       int occ = countoccurence(nums, num2);
       System.out.println("your element was found: " + occ+ " times ");

    }


    public static int countoccurence(int[] nums , int num2){
        int occ = 0;
        for(int num:nums){
            if(num == num2){
                occ++;
            }

        }
        return occ;
    }
    
}
