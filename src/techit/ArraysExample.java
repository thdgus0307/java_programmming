package techit;

public class ArraysExample {

    public static void main(String[] args) {

        // 배열(Arrays)

        int[] price =  {10000, 9000, 40000, 7000}; // int를 모아둔 배열의 변수이다
        String[] mbti = {"infp", "enfp", "istj", "estj"};

        System.out.println(price[0]); // 인덱싱
        System.out.println(mbti[0]);

        price[1] = 8000; // 임의의 값 수정
        System.out.println(price[1]);

        System.out.println(price); // 주소값을 출력함(배열이 기본형이 아니기 때문에)

        System.out.println(mbti.length); // 총 길이 확인

        for(int i = 0; i < mbti.length; i++){
            System.out.println(mbti[i]);
        }
    }
}
