import java.util.*;

class Ques1{

    void average(double num1, double num2, double num3){
        double avg = (num1 + num2 + num3) / 2;
        System.out.println("Average: " + avg);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        sc.close();

       // (if you dont want to create obj then you have to write  static keyword before void average method)
       
        Ques1 obj = new Ques1();  
        obj.average(num1, num2, num3);
        
    }

    

}