import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String result = "";
        
        for(int i=0; i<original.length(); i++){
            if(original.charAt(i)=='e'){
                result = result+'i';
            }else{
                result = result + original.charAt(i);
            }
        }
        
        System.out.print(result);
    }    
}  
