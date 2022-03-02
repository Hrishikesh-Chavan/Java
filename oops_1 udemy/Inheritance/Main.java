

public class Main{
    public static void main(String[] args) {
        Animal a1 = new Animal("a1", 1, 1, 5, 5);
        Dog d1 = new Dog("abc", 8, 20, 2, 4, 1, 20,"long silky");
        d1.eat();
        System.out.println(d1.getName());

    }
}