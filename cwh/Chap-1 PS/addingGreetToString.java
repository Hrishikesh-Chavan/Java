import java.util.*;

public class addingGreetToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        String str = sc.nextLine();

        System.out.println("Hello, " + str + " Have a great day!!!");


        sc.close();
    }
    
}
