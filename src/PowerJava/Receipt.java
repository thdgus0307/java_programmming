package PowerJava;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        int m;
        int p;
        int s;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.print("받은 돈: ");
        m = sc.nextInt();

        System.out.print("상품 가격: ");
        p = sc.nextInt();

        s = p/10;
        System.out.println("부가세: " + s);

        c = m - p;
        System.out.println("잔돈: " +c);


    }
}
