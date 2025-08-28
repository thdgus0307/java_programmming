package PowerJava.Ch5;

class BankAccount{
    int amount;

    public BankAccount(int amount){
        this.amount = amount;
    }
    public int transfer(int amount, BankAccount otherAccount){
        otherAccount.amount += amount;
        this.amount -= amount;

        return this.amount;
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(100000);
        BankAccount obj2 = new BankAccount(0);

        System.out.println("myAccount1: 현재 잔액은 "+obj1.amount+"입니다.");
        System.out.println("myAccount2: 현재 잔액은 "+obj2.amount+"입니다.");
        System.out.println("transfer(1000)");
        obj1.transfer(1000, obj2);
        System.out.println("myAccount1: 현재 잔액은 "+obj1.amount+"입니다.");
        System.out.println("myAccount2: 현재 잔액은 "+obj2.amount+"입니다.");


    }
}
