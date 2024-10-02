package techit;

public class StringExample {

    public static <Stirng> void main(String[] args) {

        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소



        String str = "안녕하세요!"; // 문자열 리터럴(값 자체를 가르키는 용어), 동일한 값이 있다면 같은 주소로 저장함.
        String str_2 = new String("안녕하세요!"); // 생성자, 무조건 새로운 생성자 생성
        String str_3 = "안녕하세요!";

        if (str == str_2) {
            System.out.println("str == str_2");
        }

        if (str == str_3) {
            System.out.println("str == str_3");
        }

        if (str_2 == str_3) {
            System.out.println("str_2 == str_3");
        }

        // 값을 비교할때는 equals 매소드 사용하기
        if (str.equals(str_2)) {
            System.out.println("str.equals(str_2)");
        }
        if (str.equals(str_3)) {
            System.out.println("str.equals(str_3))");
        }
        if (str_2.equals(str_3)) {
            System.out.println("str_2.equals(str_3)");
        }



        // 문자열 병합

        // 1. '+' 연산자
        String str_4 = "Hello,";
        String str_5 = "World!";

        System.out.println(str_4 + " " + str_5);

        // 2. StringBuilder
        StringBuilder strBdr_1 = new StringBuilder("Hello,");

        strBdr_1.append("World!");

        System.out.println(strBdr_1.toString()); //toString() => string으로 바꾸는 거



        // 문자열 슬라이스

        String str_6 = "이름: 김자바";
        System.out.println(str_6.indexOf("이")); // indexOf() 인데스 위치 알려주는
        System.out.println(str_6.indexOf("름"));
        String str_name = str_6.substring(4, 7);  // substring() 슬라이스하는 함수
        System.out.println(str_name);

        // 문자열 대소문자 변환

        String str_7 = "abc";
        String str_8 = "ABC";

        str_7 = str_7.toUpperCase();
        str_8 = str_8.toLowerCase();

        System.out.println(str_7);
        System.out.println(str_8);

        if (str_7.equalsIgnoreCase(str_8)) {
            System.out.println("str_7.equals(str_8)");

        } //equalsIgnoreCase => 대소문자 무시하고 비교함


        // 공백 제거

        // 1. 양쪽 끝 공백
        String str_9 = "     Hello  ";
        str_9 = str_9.trim(); // trim() => 양쪽 공백 제거
        System.out.println(str_9);

        // 2. 문자열 중간 공백
        String str_10 = "    Hel   lo";
        str_10 = str_10.trim();
        str_10 = str_10.replace(" ", ""); // replace() => 어떤 문자를 다른 걸로 대체하겠다.
        System.out.println(str_10);

    }
}

