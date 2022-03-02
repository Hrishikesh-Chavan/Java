import java.util.Scanner;

class Ques5 {
    
    static String age(int age){
        
        if (age > 18){
            return "Eligible";
        }else{
            return "Not Eligible";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.close();

        String eligibility = age(age);
        System.out.println(eligibility);
    }
}
