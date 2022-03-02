

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("For Writing");
    }

    public void printColour(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

// <--------------------------------  Constuctor ------------------------------------------------->
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(String name, int age){     // Constuctor
        this.name = name;
        this.age = age;
    }
}






public class Main{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        

        pen1.color ="blue";
        pen1.type ="ballpoint";

        pen2.color = "black";
        pen2.type = "gelPen";

        pen1.printColour();
        pen1.printType();
        pen1.write();

        System.out.println("\n");
        
        pen2.printColour();
        pen2.printType();
        pen2.write();

        Student s1 = new Student("demon", 24);

        // s1.name ="demon";
        // s1.age =24;

        s1.printInfo();
        
    }
}