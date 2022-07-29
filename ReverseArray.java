// How to reverse an array.

import java.util.Scanner;

public class ReverseArray {

    public static Scanner sc = new Scanner(System.in);

    public static void reverse(int a[]){
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {45, 78, 89, 47, 36};
        reverse(arr);
    }
}

// // Java program to ReverseString using StringBuilder
// import java.lang.*;
// import java.io.*;
// import java.util.*;

// // Class of ReverseString
// class ReverseString {
// 	public static void main(String[] args)
// 	{
// 		String input = "Geeks for Geeks";

// 		StringBuilder input1 = new StringBuilder();

// 		// append a string into StringBuilder input1
// 		input1.append(input);

// 		// reverse StringBuilder input1
// 		input1.reverse();

// 		// print reversed String
// 		System.out.println(input1);
// 	}
// }


// // Reversing an array using Java collections
// import java.util.*;

// public class reversingArray {

// 	// function reverses the elements of the array
// 	static void reverse(Integer a[])
// 	{
// 		Collections.reverse(Arrays.asList(a));
// 		System.out.println(Arrays.asList(a));
// 	}

// 	public static void main(String[] args)
// 	{
// 		Integer [] arr = {10, 20, 30, 40, 50};
// 		reverse(arr);
// 	}
// }

// // Java Program for Reversing an array using StringBuilder

// import java.util.Arrays;

// class GFG {
// 	public static void main (String[] args) {
// 	String[] arr = {"Hello", "World"};
// 	StringBuilder reversed = new StringBuilder();

// 	for (int i = arr.length; i > 0; i--) {
// 		reversed.append(arr[i - 1]).append(" ");
// 	};
		
// 	String[] reversedArray = reversed.toString().split(" ");
		
// 	System.out.println(Arrays.toString(reversedArray));
// 	}
// }
