package PowerJava.Ch3;

import java.util.Scanner;

public class PE3_4 {
    public static void main(String[] args) {
        int tall;
        int weight;
        double standard;
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요: ");
        tall = sc.nextInt();
        System.out.print("몸무게를 입력하세요: ");
        weight = sc.nextInt();

        standard = (tall - 100)*0.9;

        if(weight>standard)
            System.out.println("과체중입니다.");
        else if(weight<standard)
            System.out.println("저체중입니다.");
        else
            System.out.println("표준 체중입니다.");


    }
}
