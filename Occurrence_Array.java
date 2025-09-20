package challenges;

import java.util.Scanner;


public class Occurrence_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO OCCURRENCE OF ARRAY :");
        System.out.println("enter the number you want to find :");
        int[] numArra = ArrayUtility.inputarray();
        
        int num = input.nextInt();
        int occurrence = noofoccurrence(numArra, num);
        System.out.println("your element was found " + occurrence );
    }

    public static int noofoccurrence(int[] numArry, int num){
        int occ = 0;
        for(int i = 0; i < numArry.length; i++ ){
            if(numArry[i] == num){
                occ++;
            }
        }

        return occ;
    }
}
