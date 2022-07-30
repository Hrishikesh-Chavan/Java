import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallengeExerciseUdemy{

    private static Scanner sc = new Scanner(System.in);

    public static int[] getInt(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter "+ capacity +" integer value:\r");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int [] sortedArray(int[] array){
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int[] myInt = getInt(5);
        int[] sorted = sortedArray(myInt);
        printArray(sorted);

    }

    
}

