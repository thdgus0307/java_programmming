package PowerJava;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        double c_temp;
        double f_temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨 온도를 입력하시오: ");
        f_temp = sc.nextDouble();

        c_temp = (f_temp - 32.0)*5.0/9.0;
        System.out.println("섭씨온도는 " + c_temp);

    }
}
