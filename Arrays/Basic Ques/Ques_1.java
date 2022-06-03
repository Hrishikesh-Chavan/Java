/* Ques.1: Create an Array of size 10 of integers.
           Take input from the user for these 10 elements and print the entire array after that  */


import java.util.*;

public class Ques_1{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            arr[i]= obj.nextInt();
        }
        obj.close();

        for(int e: arr){
            System.out.println(e);
        }
    }
}