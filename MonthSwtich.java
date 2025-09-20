package challenges;

import java.util.Scanner;

public class MonthSwtich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE MONTH MAPPING \n");
        System.out.print("Please enter the month number :");
        int month = input.nextInt();
        String monthName = getMonthName(month);
        System.out.println("your month name is :" + monthName);

    }

    public static String getMonthName(int monthNum){
          return switch(monthNum){
            case 1 -> "jan";
            case 2 -> "feb";
           case 3 -> "march";
           case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
             case 7 -> "july";
           case 8-> "aug";
              case 9 -> "sept";
             case 10-> "oct";
              case 11 -> "nov";
               case 12 -> "dec";
               default -> "invalid month";

             

        };

        
    }
}
