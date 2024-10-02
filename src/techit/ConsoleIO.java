package techit;

import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner 객체 필요, 사용자의 디바이스 입력장치에 연결한다고 보면 됨

        System.out.print("ID를 입력해주세요. >>"); // println에서 ln을 지우고 사용하면 개행(\n)을 하지 않음
        String username = sc.nextLine(); // 사용자로부터 입력값을 받아 string형태로 사용가능

        System.out.print("생년월일를 입력해주세요. >>");
        int birthDate = sc.nextInt(); // 사용자로부터 입력값을 받아 int형태로 사용가능

        System.out.printf("아이디: %s\n생년월일: %d", username, birthDate); // 포멧을 지정해줄때는 printf로 사용함.

    }
}
