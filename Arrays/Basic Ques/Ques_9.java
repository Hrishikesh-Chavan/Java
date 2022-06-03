// Ques_9 : Find diff b/w first and last element of array.

import java.util.*;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int sizeOfArray = obj.nextInt();
        int[] arr = new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        Arrays.sort(arr);

        System.out.print("Range: " + (arr[arr.length-1] - arr[0])); // Difference b/w last and frist element.
    }
}
