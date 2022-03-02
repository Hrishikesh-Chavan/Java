class Students{
    private String name;
    private int rollNo;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(int rn){
        this.rollNo = rn;
    }

    public int getRollNo(){
        return rollNo;
    }
}

public class Main{
    public static void main(String[] args){
        Students s1 = new Students();

        s1.setName("abc");
        System.out.println(s1.getName());

        s1.setRollNo(45);
        System.out.println(s1.getRollNo());


    }
}