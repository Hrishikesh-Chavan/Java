import java.util.Arrays;

public class AnagramOrNor {
    public static void main(String[] args) {
        

        String s1 = "listen";
        String s2 = "silenp";

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        if(ch1.length != ch2.length){
            System.out.println("Not Anagram");
            System.exit(0);
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0; i<ch1.length; i++){
            if(ch1[i] != ch2[i]){
                System.out.println("Not Anagram");
                System.exit(0);
            }
        }

        System.out.print("Anagram");


    }
}
