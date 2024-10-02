package techit;

import java.util.HashMap;

public class MapsExample {

    public static void main(String[] args) {

        // Map
        // 키 - 값 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음
        // 키는 중복 불가, 값은 중복 허용
        // HashMap

        HashMap map = new HashMap(); // 인자 안넣어도 괜찮음
        map.put("age", 30);
        map.put("mbti", "INFP");

        System.out.println(map.get("age")); // get 인자에 인덱스가 아니라 키 값을 넣는다.

        // 데이터 타입 제한
        HashMap<String, String> map2 = new HashMap();
        map2.put("age", "30");


    }
}
