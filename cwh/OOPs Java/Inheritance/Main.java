class Shape{
    String color;
    float b;
    float h;
}

class Triangle extends Shape{
    public void printColor(String color){
        System.out.println(this.color);
    }

    public void printArea(float a, float b){
        System.out.println("area is: " + (b*h)/2);
    }
}

public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();

        t1.printColor(t1.color = "red");
        t1.printArea(t1.b = 20, t1.h = 5);

    }
}