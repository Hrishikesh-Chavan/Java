import java.util.Scanner;

public class hasIntergerOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        System.out.println(sc.hasNextInt());
        
        sc.close();
    }

    
}
