import java.util.*;

public class Ques_2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int sizeOfArray = obj.nextInt();
        int inputVar = obj.nextInt();

        int[] arr = new int[sizeOfArray];

        for(int i=0;i<sizeOfArray;i++){
            arr[i] = obj.nextInt();
        }

        boolean isInArray = false;

        for(int i=0;i<sizeOfArray;i++){
            if(arr[i] == inputVar){
                isInArray = true;
            }          
        }
        
        System.out.println(isInArray);
    }
}
