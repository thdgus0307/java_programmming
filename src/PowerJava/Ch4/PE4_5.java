package PowerJava.Ch4;

class Account2 {
    int balance;

    Account2(){
        balance = 0;
    }
    public void withdraw(int amount){
        balance -= amount;
        System.out.println(amount+"원 인출");
    }
    public void deposit(int amount){
        balance += amount;
        System.out.println(amount+"원 저축");
    }

    public void printB(){
        System.out.println("계좌 잔고="+balance);
    }

}
public class PE4_5 {
    public static void main(String[] args) {
        Account2 obj1 = new Account2();
        Account2 obj2 = new Account2();
        System.out.println("새로운 계좌가 만들어졌습니다.");
        obj1.deposit(50000);
        System.out.println("새로운 계좌가 만들어졌습니다.");
        obj2.deposit(100000);
        System.out.print("고객 #1");
        obj1.printB();
        System.out.print("고객 #2");
        obj2.printB();
    }
}
