import java.util.*;

public class TakeInputsFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count=0;
        int sum=0;

        while(true){
            int order = count + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
                int number = sc.nextInt();
                count++;
                sum+=number;
                if(count==10){
                    break;
                }
            }else{
                System.out.println("Invalid number");
            }

            sc.nextLine();

        }

        System.out.println("Sum: " + sum);
        sc.close();

    }
}
