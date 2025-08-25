package PowerJava.Ch5;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("홍콩");
        list.add("싱가포르");
        list.add("괌");
        list.add("사이판");
        list.add("하와이");

        System.out.println("여형지 추전 시스템이다.");
        int index = (int)(Math.random()* list.size());
        System.out.println("추천 여행지는"+list.get(index));
    }

}
