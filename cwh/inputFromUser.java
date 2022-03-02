import java.util.*;

public class inputFromUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        int input1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int input2 = sc.nextInt();

        int sum = input1 + input2;
        System.out.println("Ans: " + sum);

        
        sc.close();

    }

    
}
