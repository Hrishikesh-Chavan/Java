import java.util.Scanner;

// print the character at given index
public class CharAt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(index);
        
        System.out.println(ch);
        sc.close();
        
    }
}
