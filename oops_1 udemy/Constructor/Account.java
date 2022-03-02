public class Account {

    private String number;
    private double balance;
    private String name;

    
    public Account(String number, double balance, String name){
        this.number = number;
        this.balance = balance;
        this.name = name;
    }


    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposite(double depositeAmount){
        this.balance += depositeAmount;
        System.out.println("New Balance: " + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance < 0){
            System.out.println("Insufficient balance");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal " + withdrawalAmount + " Processed " + " New balance: " + this.balance);
        }
    }

}
