

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        // String accountNumber = obj.next();
        // double accountBalance = obj.nextDouble();
        // String customerName = obj.next();
        // obj.close();

        Account a1 = new Account("45", 1500, "bbc");
        // System.out.println(a1.getNumber());
        System.out.println(a1.getBalance());
        // System.out.println(a1.getName());
        a1.withdrawal(1500);

        // VipPerson v1 = new VipPerson();
        // System.out.println(v1.getName());

        // VipPerson v2 = new VipPerson("name2", 2100);
        // System.out.println(v2.getName());

        // VipPerson v3 = new VipPerson("name3", 7800, "bbc@gmail.com");
        // System.out.println(v3.getName());

    }
}
