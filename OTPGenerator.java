import java.util.*;

public class OTPGenerator{
    public static void main(String[] args) {

        System.out.println(OTP());
        
    }

    public static String OTP(){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<=9;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        int otp=0;
        otp =  (list.get(0)*1000) + (list.get(1)*100) +(list.get(2)*10) + list.get(3);

        return "Your OTP number is: " + Integer.toString(otp);

    }
}
