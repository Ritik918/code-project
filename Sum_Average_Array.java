package challenges;

public class Sum_Average_Array {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SUM AND AVERAGE OF ARRAY");
        int[] numArray = ArrayUtility.inputarray();
        long sum = sum(numArray);
        int average = average(numArray);
        System.out.println("Sum of the number is :" + sum);
        System.out.println("Average of the number is :" + average); 


    }
      
    public static long sum(int[] numArray){
        long sum = 0;
        for(int i = 0; i < numArray.length; i++){
            sum = sum + numArray[i];
        }
        return sum;
    }
     
     public static int average(int[]numArray){
        long sum = sum(numArray);

        return (int) (sum / numArray.length);
     }


}
       
      

    

