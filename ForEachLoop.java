package challenges;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] name = new String[]{
          "RAM", "RITIK", "SOHAN", "MOHAN", "SITA"
        };
        printArray(name);
    }


    public static void printArray(String[] array){
           for(String name : array){
            System.out.println(name);
           }

    }
}
