import java.util.Scanner;

class Ques3 {
    static double greaterNumber(double a, double b){
        
        if (a > b){
            return a;
        }else{
            return b;
        }

        
    }   


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);     
        
        double a = obj.nextDouble();
        double b = obj.nextDouble();
        obj.close();

        double greater = greaterNumber(a, b);
        System.out.println(greater);

    }
}
