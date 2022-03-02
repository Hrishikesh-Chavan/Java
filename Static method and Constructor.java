/* Static Method */

import java.util.Scanner;

class sumofNnaturalnumbers{

    static void sum(int n){

        int sum=0;
        for (int i=0; i<=n; i++){
            sum+=i;
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        sum(n);         
    }
}



/* Constructor */

import java.util.Scanner;

class sumofNnaturalnumbers{

    sumofNnaturalnumbers(int n){

        int sum=0;
        for (int i=0; i<=n; i++){
            sum+=i;
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        new sumofNnaturalnumbers(n);
        
        
    }
}
