// Bubble Sort

import java.util.*;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int sizeOfArray = obj.nextInt();
        int[] arr = new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int e: arr){
            System.out.print(e + " ");
        }
    }
}
