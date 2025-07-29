package PowerJava;

import java.util.Scanner;

public class Orange {
    public static void main(String[] args) {
        int count;
        int box;
        int r;
        Scanner sc = new Scanner(System.in);

        System.out.print("오렌지의 개수를 입력하시오: ");
        count = sc.nextInt();
        box = count/10;
        r = count%10;
        System.out.println(box+"가 필요하고 " + r +"개가 남았습니다.");
    }
}
