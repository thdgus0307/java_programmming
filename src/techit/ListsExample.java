package techit;

import java.util.ArrayList;

public class ListsExample {

    public static void main(String[] args) {

        // Lists
        // 순서를 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList list = new ArrayList(10); // 객체여서 new 연산자 필요, 넘어 가는 인자(파라미터)는 길이
        list.add(100);
        list.add("INFP");

        for(int i = 0; i < list.size(); i++){
            // ArrayList는 길이를 length 대신  size를 사용함
            System.out.println(list.get(i)); // 인덱스를 get으로 연다음 할당

        }

        // 데이터 타입을 제한하고 싶다면 <>을 사용
        ArrayList<Integer> list1 = new ArrayList(10);
        list1.add(100);
    }
}
