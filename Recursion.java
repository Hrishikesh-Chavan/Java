import java.util.Scanner;

class Recursion{

    int sum(int n){
        if (n>0){
            return n+sum(n-1);
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        sc.close();

        Recursion obj = new Recursion();
        int ans = obj.sum(n);

        System.out.print("Sum of n natural numbers: " + ans);

        
    }
}
