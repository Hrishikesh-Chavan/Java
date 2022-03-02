import java.util.*;

class Ques8 {

    static double func(double x, double n){
        return Math.pow(x,n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double n = sc.nextDouble();
        sc.close();

        System.out.printf("%f",func(x,n));

    }
}
