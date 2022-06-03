// Sort 0's, 1's, 2's  in given input array. Without sorting algo..

import java.util.*;

class Ques_8{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int size = obj.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        int count0=0, count1=0, count2=0;
        for(int i=0;i<arr.length;i++){
            
            switch(arr[i]){
                case 0: count0++;break;
                case 1: count1++;break;
                case 2: count2++;break;
            }
        }

        System.out.println("0's: "+ count0 + ", 1's: " + count1 + ", 2's: " + count2);

        int i = 0;
        while(count0>0){
            arr[i] = 0;
            count0--;
            i++;
        }

        while (count1>0){
            arr[i] = 1;
            count1--;
            i++;
        }

        while (count2>0){
            arr[i] = 2;
            count2--;
            i++;
        }

        for(int e: arr){
            System.out.print(e + " ,");
        }

    }
}