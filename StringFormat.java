package challenges;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Ritik";
        int marks = 104557;

       // System.out.println("Hello " + name + " your marks is :" + marks);

       System.out.printf("hello %10s,your marks are :%-+,15d ", name , marks);
    }
}
