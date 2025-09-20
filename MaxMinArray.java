package challenges;

public class MaxMinArray {
    public static void main(String[] args) {
       System.out.println("WELCOME TO  FINDING MAX AND MIN OF ARRAY : ");
            int[] num = {12,14,56,78,99};

            int max = num[0];
            int min = num[0];
            for(int i = 1; i < num.length;i++){
                if(num[i] > max){
                    max = num[i];
                }
                if(num[i] < min){
                    min = num[i];
                }
            }
            System.out.println("Maximum element :" + max);
            System.out.println("Minimum element :" + min);
       
}
}
