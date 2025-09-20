package challenges;

public class BreakAndContinue {
    public static void main(String[] args){
       System.out.println("Before loop");
        for(int i = 1; i < 1000; i++){
            if(i == 100){
              break; // print 99
           }
           System.out.println(i);
       }
        System.out.println("out of loop");





        System.out.println("Before loop");
        for(int i = 1; i < 10; i++){
            if(i == 5){
                continue; // skip 5
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }
}
