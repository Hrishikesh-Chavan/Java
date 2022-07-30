import java.util.Arrays;
import java.util.Scanner;

public class MinMax{

    public static Scanner sc = new Scanner(System.in);

    public static void minmax(int num){
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mini = arr[0]; // 0 = first index
        int max = arr[arr.length-1]; // arr.length-1 = last index(4)
        System.out.println("Minimum: " + mini + " Maximum: " + max);
    }

    

    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int num = sc.nextInt();
        minmax(num);
    }
}
