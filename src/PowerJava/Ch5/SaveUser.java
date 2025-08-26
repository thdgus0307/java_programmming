package PowerJava.Ch5;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    String userId, password;
    static int count;

    //객체화 한거임
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
        count++;
    }
}
public class SaveUser {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<User>();
        Scanner scanner = new Scanner(System.in);
        int num =0;
        String userId;
        String password;
        do {
            System.out.println("=============================");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Print All User");
            System.out.println("4. Exit");
            System.out.println("=============================");

            System.out.print("번호를 입력하시오: ");
            num = scanner.nextInt(); //enter가 범퍼에 남게됨
            switch (num) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Id:");
                    userId = scanner.nextLine(); //enter까지 읽음
                    System.out.print("Password:");
                    password = scanner.nextLine();
                    list.add(new User(userId,password));
                    System.out.println("=============================");
                    break;

                case 3:
                    for(User obj:list)
                        System.out.println("{"+obj.userId+","+obj.password+"}");
                    System.out.println("=============================");
                    break;

                default:
                    break;
            }


        }while (num != 4);
    }
}





