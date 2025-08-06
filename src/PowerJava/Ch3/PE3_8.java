package PowerJava.Ch3;

import java.util.Scanner;

public class PE3_8 {
    public static void main(String[] args) {
        String operator;
        double x;
        double y;
        Scanner sc = new Scanner(System.in);

        System.out.print("연산을 입력하세요: ");
        operator = sc.next();

        System.out.print("숫자 2개를 입력하세요: ");
        x= sc.nextDouble();
        y = sc.nextDouble();

        switch (operator){
            case "+":
                System.out.println(x+"+"+y+" =" +(x+y));
                break;
            case "-":
                System.out.println(x+"-"+y+" =" +(x-y));
                break;
            case "*":
                System.out.println(x+"*"+y+" =" +(x*y));
                break;
            case "/":
                System.out.println(x+"/"+y+" =" +(x/y));
                break;
            default:
                break;

        }
    }
}
