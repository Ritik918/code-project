package challenges;
import java.util.Scanner;

public class PasswordChecker {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("WELCOME TO THE PASSWORD CHECKER\n");
      String password;
      do { 
          System.out.print("Please enter your password :");
          password = input.next();
      } while(isvalidpassword(password));
      System.out.println("thank for valid password :");
  } 
  
  
  public static boolean isvalidpassword(String password){
    return password.length() > 6;
  }
 }


