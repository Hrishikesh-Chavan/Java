import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter First No: ");
        double no1 = obj.nextInt();

        System.out.println("Enter Second No: ");
        double no2 = obj.nextInt();

        System.out.println("Enter required operation: ");
        char ope = obj.next().charAt(0);

        double res = no1 + no
        System.out.println(no1+ " "+ope+" "+no2+" = "+res);

        obj.close();    

    }

    
}
