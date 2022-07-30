class StringPalindromeOrNot{

     static int isPalindrome(String s){
        
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        if(s.equals(rev)){
            return 1;
        }else{
            return 0;
        }

        
    }

    public static void main(String[] args){

        String s = "123";
        int res = isPalindrome(s);

        if(res==1){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


        


    }
}