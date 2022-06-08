class Pattern_4{
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++){  // rows
            
            for(int j=1; j<i ;j++) {  // spaces
                System.out.print(" ");
            }
            
            for(int k=i; k<=5; k++){  //cols
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}