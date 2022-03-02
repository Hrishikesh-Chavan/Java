// Write a function to print the sum of all odd number from 1 to n. 

import java.util.*;

public class Ques2 {
    static void sumOfOddNumbers(int n){

        int sum = 0;
        for(int i=1; i <= n; i++){
            if(i % 2 != 0){          // Logic of odd number.
                sum += i;
            }
        }

        System.out.print("Sum: " + sum);
    }    

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        obj.close();

        sumOfOddNumbers(n);
    }
}
