package techit;

public class ReferenceType {

    public static void main(String[] args) {

        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역에 생성됨.
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값

        String a = new String("Hello!");// 객체를 생성하는 new 연산자를 사용한 후 생성자 함수인 클래스이름을 쓰고 괄호를 해야함.
        System.out.println(a);
        // a는 힙 메모리에 어느 곳에 Hello!문자열이 있는지 주소만 가지고 있을뿐 hello!를 가지고 있는건 아님

        //리터럴 방식으로 생성
        String b = "Hello!"; // 이렇게도 가능!
        String c = "Hello!";


        // a와 b의 Hello!가 같은 위치에 있는지 확인하기 위함
        if (a == b){
            System.out.println("a == b");
        }
        //b와 c의 Hello!가 같은 위치에 있는지 확인하기 위함
        if (b == c){
            System.out.println("b == c");
        }
        //리터럴 방식으로 하면 기존에 힙 메모리에 동일한 값이 있는지 찾고,
        //동인한 값이 있다면 새로 객체를 만들지 않고 기존에 있는 값에 주소를 동일하게 갖게됨
    }
}
