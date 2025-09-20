package challenges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputarray(){
        Scanner input = new Scanner(System.in);
         System.out.print("enter the array :");
        int size = input.nextInt();
        

        int[] num= new int[size];
        
        
        for(int i = 0; i < size; i++){
            System.out.println("please enter element number " + (i+1) + ":");
            num[i] = input.nextInt();

        }
        return num;

    }
}
