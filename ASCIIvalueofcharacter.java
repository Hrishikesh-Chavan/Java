import java.util.Scanner;

public class ASCIIvalueofcharacter {

    ASCIIvalueofcharacter(char ch){
        int a = ch;  // implicit typecasting i.e char is smaller than int datatype, it will automatically convert.
        System.out.print("ASCII value of "+ch + " is " + a);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        new ASCIIvalueofcharacter(ch);

    }
}
