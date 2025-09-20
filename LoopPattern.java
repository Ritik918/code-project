package challenges;

import java.util.Scanner;

public class LoopPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of rows :");
        int rows = input.nextInt();
        firstpattern(rows);
         secondpattern(rows);

    }
     public static void secondpattern(int maxrows){
        System.out.println("Here is the Second Pattern");
        int rows = maxrows;
        while(rows > 0){
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }

            System.out.println();
            rows--;
        }
     }



    public static void firstpattern(int maxrows){
        System.out.println("Here is the First Pattern");
        int rows = 0;
        while(rows < maxrows){
            System.out.print("*");
            
            int i = 0 ; 
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}
