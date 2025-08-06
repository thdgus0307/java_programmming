package PowerJava.Ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class PE3_9 {
    public static void main(String[] args) {
        int num;
        ArrayList<Integer> list;
        list = new ArrayList<>();
        list.add(0);
        list.add(1);
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 항의 개수: ");
        num = sc.nextInt();
        for(int i = 2; i< num; i++)
        {
            list.add(list.get(i - 2) + list.get(i - 1));
        }

        for (Integer obj:list)
            System.out.print(obj+" ");


    }
}
