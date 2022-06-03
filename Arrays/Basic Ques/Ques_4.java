// Find the Reverse of Array


import java.util.*;

class Ques_4{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        obj.close();

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}