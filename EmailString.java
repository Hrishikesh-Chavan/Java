import java.util.*;

class EmailString{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String username = "";
        
        for(int i=0;i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                username = username+email.charAt(i);
            }
        }
        
        System.out.print(username);
    }
}
