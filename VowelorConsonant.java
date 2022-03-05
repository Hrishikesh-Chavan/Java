import java.util.Scanner;

class VowelorConsonant{

        // using constructor

    VowelorConsonant(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character in lowercase: ");
        char ch = sc.next().charAt(0);
        sc.close();

        new VowelorConsonant(ch);
    }
}

// class VowelorConsonant{

//     using static method

//     static void check(char ch){

//         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//             System.out.println("Vowel");
//         }else{
//             System.out.println("Consonant");
//         }
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any character in lowercase: ");
//         char ch = sc.next().charAt(0);
//         sc.close();

//         check(ch);
//     }
// }

// class VowelorConsonant{

//     // using non-static method

//     void check(char ch){

//         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//             System.out.println("Vowel");
//         }else{
//             System.out.println("Consonant");
//         }
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any character in lowercase: ");
//         char ch = sc.next().charAt(0);
//         sc.close();

//         VowelorConsonant obj = new VowelorConsonant();
//         obj.check(ch);
        
//     }
// }
