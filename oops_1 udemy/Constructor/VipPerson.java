public class VipPerson {
    private String name;
    private double creditLimit;
    private String email;

    public VipPerson(){
        this("name1", 4500, "xyz@gmail.com");
    }

    public VipPerson(String name, double creditLimit){
        this(name, creditLimit, "abc@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}    

    
