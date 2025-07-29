package PowerJava;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        num = sc.nextInt();

        int b9 = (num / 512) % 2;
        int b8 = (num / 256) % 2;
        int b7 = (num / 128) % 2;
        int b6 = (num / 64) % 2;
        int b5 = (num / 32) % 2;
        int b4 = (num / 16) % 2;
        int b3 = (num / 8) % 2;
        int b2 = (num / 4) % 2;
        int b1 = (num / 2) % 2;
        int b0 = num % 2;

        System.out.println(""+b9+b8+b7+b6+b5+b4+b3+b2+b1+b0);
    }
}
