// How to find min and max value in array?


import java.util.*;

// METHOD: 1
class Ques_3{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        int sizeOfArray = obj.nextInt();
        int[] arr = new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        Arrays.sort(arr);  // For Sorting
        
        for (int e: arr){
            System.out.print(e + " ");
        } 

        System.out.println("\n min: " + arr[0]);                // POSITION OF 1ST INDEX
        System.out.println("max: " + arr[arr.length-1]);   // POSITION OF LAST INDEX

        

    }

    // METHOD: 2     SORT ARRAY BY BUBBLE SORT
}