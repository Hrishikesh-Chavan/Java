

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " "+ age);  // IMP : when we print argument we have to put concatenation b/w two arguments...
    }
}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();


        // IMP: Whatever function we want to use we must use the object name before that...

        s1.name = "ankit";
        s1.age = 24;

        s2.name = "abc";
        s2.age = 18;

        s1.printInfo(s1.name);
        s2.printInfo(s2.name,s2.age);
    }
}