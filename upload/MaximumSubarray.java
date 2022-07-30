// Kadane's Algo

public class MaximumSubarray {

    public static int maxSubArray(int nums[]){
        int sum = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++){
            if(sum<0){
                sum=0;
                sum += nums[i];
            }else{
                sum+=nums[i];
            }

            if(sum>max){
                max=sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int nums[] = {5,4,-1,7,8};
        System.out.println("largest sum: " + maxSubArray(nums));    

    }
}
