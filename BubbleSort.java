

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {17, 45, 1, 8, 9};

        // Bubble Sort

        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        // Print array
        for (int e: arr){
            System.out.print(e + " ");
        }
    }
}
