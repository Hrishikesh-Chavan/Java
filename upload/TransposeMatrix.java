import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];
        System.out.println("Enter element in matrix: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Matrix: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
