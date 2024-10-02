package techit;

public class Operators {

    public static void main(String[] args) {

        // 산술 연산자

        int a = 10;
        int b = 20;
        String c = "abc";

        double d = 10;
        double e = 20;

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b ); // 몫을 반환하는 나누기
        System.out.println( d / e ); // 실수 형태로 하면 소수표현이 가능함
        System.out.println( a % b );
        System.out.println( a + c ); // a가 문자열 타입으로 바뀌어 연산이 됨


        // 비교 연산자

        int f = 5;
        int g = 8;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a <= b);

        // = : 대입연산자, == : 비교연산자, string은 메모리의 주소가 할당되기때문에 같은 문자인지 확인하고 싶을땐 equals라는 메소드 사용
        System.out.println(a == b);
        System.out.println(a != b);


        // 논리 연산자

        int h = 3;
        int i = 3;
        int j = 5;

        // AND(&&) - 교집합, 모두 true여야지 true를 반환함
        System.out.println(j > h && j > i); // true && true
        System.out.println(j > h && j < i);

        // OR(||) - 합집합, 하나만 true면 true를 반환함.
        System.out.println(j > h || j < i); // true || false

        // NOT(!) - 여집합
        System.out.println(!true);
        System.out.println(!false);

        // 대입 연산자

        int  k = 1;
        double price = 12.5;

        // 증감 연산자

        k++; // k = k + 1
        k--; // k = k - 1

        ++k;
        --k;

        System.out.println(k++); // 일단 데이터를 먼저 던진 다음에 값을 더하게 됨
        System.out.println(k);  // 비로소 더해진 값이 나옴
        System.out.println(++k); // 더한 다음에 데이터를 던짐





    }
}
