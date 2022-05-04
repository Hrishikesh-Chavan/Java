import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class hexaware{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        ArrayList<Integer> c = new ArrayList<Integer>(size);
        ArrayList<Integer> d = new ArrayList<Integer>(size);
        int s=1;

        for(int i=0; i<size; i++){
            int b = sc.nextInt();
            if(b%2!=0){
                c.add(b);
            }else{
                d.add(b);
            }
        }
        sc.close();

        Collections.sort(c);
        Collections.sort(d);

        int i=0;
        if (d.get(i) < c.get(i) ){
            for(int e: c){
                d.add(s,e);
                s=s+2;
            }
            System.out.print(d);
           
        }else{
            for(int e: d){
                c.add(s,e);
                s=s+2;
            }
            System.out.print(c);
        }

    }
}
