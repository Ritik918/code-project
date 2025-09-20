package challenges;

public class ToStringMethod {
    int noofwheels;
    int noofdoors;
    int maxspeed;
    String name;
    String company;

    public ToStringMethod(int noofwheels, int noofdoors,
    int maxspeed,String name,String company) {
        this.noofwheels = noofwheels;
        this.noofdoors = maxspeed;
       this.name = name;
        this.company = company;
    }
    @Override
    public String toString(){
       return "my car name is: " + name;

    
    

    }

    public static void main(String[] args) {
    ToStringMethod namo = new ToStringMethod(4, 4,123, "NANO", "MARUTI");
    System.out.println(namo.toString());
    System.out.println(namo);
    }

    
     
    
}
