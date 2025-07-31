package PowerJava.Ch3;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int count =0;
        int guess;
        int answer = (int) (Math.random() *100);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            if(guess < answer)
                System.out.println("LOW");
            else if(guess>answer)
                System.out.println("HIGH");
            count ++;
        }while (guess !=answer);
        System.out.println("축하합니다. 시도횟수="+count);
    }
}
