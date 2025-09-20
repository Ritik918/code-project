package challenges;

public class EvenNumberPrint {
    public static void main(String[] args) {
        System.out.println("WELCOM TO THE ODD EVEN NUMBER CHECKER\n");
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }

    }
}
