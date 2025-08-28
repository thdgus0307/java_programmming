package PowerJava.Ch5;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int score;
        for (int i =0; i<5;i++)
        {
            System.out.print("성적을 입력하세요: ");
            score = sc.nextInt();
            list.add(score);
        }
        for(int obj : list)
            sum += obj;

        System.out.println("합계: "+sum);
        System.out.println("평균: "+ sum/5.0);
    }
}
