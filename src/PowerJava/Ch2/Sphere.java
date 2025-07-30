package PowerJava.Ch2;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        double r;
        double v;
        Scanner sc = new Scanner(System.in);

        System.out.print("구의 반지름: ");
        r = sc.nextDouble();

        v= (r*r*r)*4/3;
        System.out.println("구의 부피: "+v);

    }
}
