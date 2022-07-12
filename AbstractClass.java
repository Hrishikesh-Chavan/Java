abstract class Vehicle{
    public void vehicle(){
        System.out.println("<-------------- Welcome To My Garage------------->");
    }
    abstract void wheels(); 
    abstract void exhaust(); 
    abstract void speed(); 
    abstract void type(); 
}

class Bikes extends Vehicle{

    @Override
    public void vehicle() {
        
        super.vehicle();
    }

    public void wheels(){
        System.out.println("I have 2 wheels");
    }

    @Override
    void exhaust() {
        System.out.println("I have a Exhaust");
    }

    @Override
    void speed() {
        System.out.println("I have better acceleration than cars");
        
    }

    @Override
    void type() {
        System.out.println("I am a Superbike");
        
    }
}

class Cars extends Vehicle{
    public void wheels(){
        System.out.println("I have 4 wheels");
    }

    @Override
    void exhaust() {
        System.out.println("I have a Exhaust");   
    }

    @Override
    void speed() {
        System.out.println("I have better top end than bikes");
        
    }

    @Override
    void type() {
       System.out.println("I am a Supercar");
        
    }
}

class AbstractClass{
    public static void main(String[] args) {
         
        Cars MclarenGT = new Cars();
        Bikes RR310 = new Bikes();

        MclarenGT.vehicle();
        MclarenGT.speed();
        RR310.speed();
        
    }
}