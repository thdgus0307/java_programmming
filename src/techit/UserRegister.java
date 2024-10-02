package techit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserRegister {

    public static void main(String[] args) {

        System.out.println("==================");
        System.out.println("회원등록");
        System.out.println("==================");

        boolean register = false;
        Scanner sc = new Scanner(System.in);

        while (!register) {

            System.out.println("회원가입을 하시겠습니까?\ny: 진행   n: 취소");
            System.out.print(">> ");
            String register_input = sc.nextLine();

            if(register_input.equalsIgnoreCase("y")){
                register = true;
                System.out.println("=======================");
                System.out.println("회원가입이 진행됩니다.");
                System.out.println("=======================");
            }else if (register_input.equalsIgnoreCase("n")) {
                System.out.println("=======================");
                System.out.println("회원가입이 종료됩니다.");
                System.out.println("=======================");
            }else {
                System.out.println("입력 값을 확인해주세요.");
            }

        }

        ArrayList users = new ArrayList();

        while (true) {

            HashMap user = new HashMap();

            // ID
            System.out.print("ID: ");
            String username = sc.nextLine();

            //PW
            String password = "";
            while (true) {
                System.out.print("PW: ");
                password = sc.nextLine();
                System.out.print("PW 확인: ");
                String password_confirm = sc.nextLine();

                if (password.equals(password_confirm)) {
                    break;
                }else {
                    System.out.println("=======================");
                    System.out.println("패스워드가 일치하지 않습니다.");
                    System.out.println("=======================");
                }
            }

        }

    }
}
