package challenges;

public class SumPositiveNumber {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ADDING POSITIVE NUMBER \n");
        int[] numArr = ArrayUtility.inputarray();

        int sum = 0 ;
        for(int i = 0 ; i < numArr.length ;  i++){
            if(numArr[i] < 0 ){
                continue;   // skip negative number
            }
            sum = sum + numArr[i]; // add only positive number
        }
        System.out.println("the sum of positive number is :" + sum);
    }
    
}
