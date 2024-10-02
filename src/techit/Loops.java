package techit;

public class Loops {

    public static void main(String[] args) {

        // 반복문
        // 1. for
        // 초기화된 변수, 조건식(무한 루프가 발생하지 않도록 주의), 증감식

        for (int i = 0; i < 10; i+= 2){
            System.out.println(i);
        }

        // 2. while

        int b = 10;

        while (b > 0) {
            System.out.println(b);
            b--;
        }

        // 조건식과 관계 없이 무조건 한번은 실행한다
        do {
            System.out.println(b);
            b--;
        } while (b > 0);
    }
}
