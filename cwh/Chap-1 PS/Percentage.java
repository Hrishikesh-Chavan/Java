import java.util.*;

public class Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("------Percentage Calculator-------");

        System.out.println("Enter marks of first Sub: ");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks of second Sub: ");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks of third Sub: ");
        int sub3 = sc.nextInt();

        System.out.println("Enter marks of fourth Sub: ");
        int sub4 = sc.nextInt();

        System.out.println("Enter marks of fifth Sub: ");
        int sub5 = sc.nextInt();

        float add = sub1+sub2+sub3+sub4+sub5; 
        float per = (add / 500) * 100;

        System.out.println("Your Percentage is : " + per + " %");

        sc.close();
    }    


}
