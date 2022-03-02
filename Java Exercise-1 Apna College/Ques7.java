import java.util.Scanner;

class Ques7 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int inputs = sc.nextInt();
    int[] arr = new int[inputs];
    
    int postivies = 0; int negativies=0; int zeros=0;

    for(int i=0; i < arr.length; i++){
        arr[i] = sc.nextInt();

        if(arr[i] > 0){
            postivies++;
        }else if(arr[i] < 0){
            negativies++;
        }else{
            zeros++;
        }
    }
    sc.close();

    System.out.println("postivies: " + postivies + " negativies: " + negativies + " zeros: " + zeros);


    } 

}
