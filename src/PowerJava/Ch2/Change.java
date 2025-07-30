package PowerJava.Ch2;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        double m;
        double k;
        Scanner sc = new Scanner(System.in);

        System.out.print("마일을 입력하시오: ");
        m = sc.nextDouble();

        k = m * 1.609;
        System.out.println(m + "마일은 "+ k +"킬로미터입니다.");
    }
}
