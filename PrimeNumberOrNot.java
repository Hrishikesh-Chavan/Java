import java.util.Scanner;

class PrimeNumberOrNot{

    static void primenumber(int num){

        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a num: ");
        num = sc.nextInt();
        sc.close();

        primenumber(num);

    }
}
