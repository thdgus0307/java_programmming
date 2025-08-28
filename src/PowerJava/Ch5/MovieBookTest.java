package PowerJava.Ch5;

import java.util.ArrayList;
import java.util.Scanner;

class MovieSeat{
    int seat;
     public MovieSeat() {
         this.seat = 0; // 0을 해도 객체를 생성을 호출해줘야함
     }

}
public class MovieBookTest {
    public static void main(String[] args) {
        MovieSeat[] list;
        list = new MovieSeat[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = new MovieSeat();  // 실제 객체 생성
        }
        Scanner sc = new Scanner(System.in);
        int book = 0;

        do {
            System.out.println("-----------------------------------");
            System.out.println("0 1 2 3 4 5 6 7 8 9");
            System.out.println("-----------------------------------");
            for(MovieSeat obj : list)
                System.out.print(obj.seat+" ");
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.print("몇번째 좌석을 예약하시겠습니까? ");
            book = sc.nextInt();
            list[book].seat =1;
        } while(book != 10);

    }


}
