package boj;

import java.util.Scanner;

public class Q10869 {
    public static void main(String[] args) {
        //A+B, A-B, A*B, A/B(몫), A%B(나머지)
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
