class Pattern_3{
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){  // rows
            
            for(int j=i; j<5 ;j++) {  // spaces
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++){  //cols
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
