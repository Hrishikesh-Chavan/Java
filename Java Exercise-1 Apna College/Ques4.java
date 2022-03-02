import java.util.*;

class Ques4{

    static double circumference(float r){
        double circumference = 2 * Math.PI * r;
        return circumference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        sc.close();

        double radius = circumference(r);
        System.out.println(radius);
    }
}