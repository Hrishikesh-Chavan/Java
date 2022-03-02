class Main {
    
    static int x = 10;   // Static varible . It has permanent memory.
    int a = 20;          // instance varible  (initiate outside of any class)

    public static void main(String[] args) {

        int b = 30;       // Local varible (In the method)

        Main obj = new Main();
        System.out.println("Varible b: " + b);
        System.out.println("varible x: " + Main.x);   // (for print static var use class name.)
        System.out.println("Varible a: " + obj.a);    // (for print instance var use obj of class.)
        


    }
}
