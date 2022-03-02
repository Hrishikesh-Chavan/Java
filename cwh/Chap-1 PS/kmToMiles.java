import java.util.*;

public class kmToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of Km: ");
        float km = sc.nextFloat();

        double conv = km * (0.62137);

        System.out.println("Miles: " + conv);

        sc.close();

    }
    
}
