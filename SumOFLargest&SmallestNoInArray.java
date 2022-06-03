import java.util.*;

public class ArraysToMethod {
   
   public int sum(int [] array){
       Arrays.sort(array);
       return array[0] + array[array.length-1];
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
     
      int[] myArray = new int[size];
      System.out.println("Enter the elements of the array ::");

      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }
     
      ArraysToMethod m = new ArraysToMethod();
      System.out.println("Sum of largest & smallest no is::"+m.sum(myArray));
   }
}
