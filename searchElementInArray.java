// Search an element in arrray.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
             arr[i] = sc.nextInt();
        }
        
        // Logic
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n)
                count++;
        }
        if(count>0){
            System.out.println("Element present in array");
        }else{
            System.out.println("Element is not present in array");
        }
        
        // Print

    }
}
