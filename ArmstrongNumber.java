package challenges;
import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("your number is Armstrong");
        } else{
            System.out.println("your number is not Armstrong");
        }
    }

    public static boolean  isArmstrong(int num){
        int noofdigit = noofdigit(num);
        int numcopy = num;
        
        int finalnumber = 0;
        while(num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalnumber += pow(lastdigit, noofdigit); 
        }
        return finalnumber == numcopy;
    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i<num2){
            result *= num1;
            i++;
        }
        return result;

    }

      
    public static int noofdigit(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num /= 10;
        }
     return  digits;
    
    }
}
    
       

    

