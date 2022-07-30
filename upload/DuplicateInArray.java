public class DuplicateInArray {
    public static void main(String[] args) {

        // brute force
        
        String str[] = {"Java", "C++", "python", "C++", "C","Java", "Python", "python"};

        boolean flag = false;
        for(int i=0; i<str.length; i++){
            for(int j=i+1; j<str.length; j++){
                if(str[i]==str[j]){
                    System.out.println("Duplicate element found: " + str[i]);
                    flag=true;
                }
            }
        }

        if(flag==false){
            System.out.println("Duplicate element not found ");
        }

        // Optimize

        // int n = nums.length;
        // Arrays.sort(nums);
        // for (int i = 0;i<n-1;i++)
        // {
        //         if(nums[i]==nums[i+1])
        //             return true;
        // }
        // return false;

    }
}
