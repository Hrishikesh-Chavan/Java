//Find how many times a input num occurs in an array.

import java.util.*;

class Ques_7{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int input = obj.nextInt();

        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(input == arr[i]){
                count++;
            }
        }

        System.out.println("Input number occurs: " + count + " times");
    }
}