package PowerJava.Ch3;

import java.util.Scanner;

public class PE3_12 {
    public static void main(String[] args) {
        int score;
        int sum =0;
        double average;
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<5; i++){
            System.out.print("성적을 입력하시오: ");
            score = sc.nextInt();
            sum += score;
        }
        average = sum/5;
        System.out.println("합계: "+sum);
        System.out.println("평균: "+ average);

    }
}
