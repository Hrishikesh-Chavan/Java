import java.util.Arrays;

public class ChocolateDistributionProblem {

    static int findMinDiff(int[] arr, int n, int m){
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i+m-1 < n; i++){ // after soting 3,4,7,9,9 
            int diff = arr[i+m-1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }

        return minDiff;
        
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        int n = arr.length;

        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));
        
    }
}
