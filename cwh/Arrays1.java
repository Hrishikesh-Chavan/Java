import java.util.*;

public class Arrays1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int [] marks = new int[10];
	    
	    for (int i=0;i<10;i++){
	        marks[i] = sc.nextInt();
	    }
	    sc.close();
	    
	    for(int e: marks){
			System.out.println(e);
		}	
		
	}
}