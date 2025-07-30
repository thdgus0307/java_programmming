package PowerJava.Ch3;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        String month;

        Scanner sc = new Scanner(System.in);
        System.out.print("달의 이름을 입력하시오: ");
        month = sc.next();

        int monthNum;
        switch (month){
            case "january":
                monthNum = 1;
                break;
            case "february":
                monthNum = 2;
                break;
            case "march":
                monthNum = 3;
                break;
            default:
                monthNum = 0;
                break;
        }
        System.out.println(monthNum);
    }
}
