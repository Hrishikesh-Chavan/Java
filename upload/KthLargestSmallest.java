// Ques_6: find 3rd(kth) largest and smallest element of array.

import java.util.*;

public class KthLargestSmallest {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        int kth = obj.nextInt();
        int sizeOfArray = obj.nextInt();
        int[] arr = new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        Arrays.sort(arr);

        System.out.println( kth + "rd Smallest: " + arr[0 + (kth-1)]);      // arr[0 + (kth-1)]           
        System.out.println(kth + "rd Largest: " + arr[arr.length-1 - (kth- 1)]); // arr[arr.length-1 - (kth-1)]


    }
}