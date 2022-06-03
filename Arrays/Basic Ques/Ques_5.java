import java.util.*;

// Sorting a given arrays by  BUBBLE SORT.
class Ques_5{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int[] arr = new int[6];

        for(int i=0;i<arr.length;i++){
            arr[i]= obj.nextInt();
        }
        
        obj.close();

        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    

        for(int e: arr){
            System.out.println(e + " ");
        }
    }

   
}

