import java.util.*;

public class Arrays2
{
	public static void main(String[] args) {
	    
	    float [] marks = {15.00f,55.68f,78.01f,5.16f,89};
	    
	    float sum = 0;
	   // for (int i=0;i<marks.length;i++){
	   //     sum = sum + marks[i];
	   // }
	   
	   for (float ele:marks){
	       sum = sum+ele;
	   }
	    
	    System.out.println(sum);
		
	}
}
