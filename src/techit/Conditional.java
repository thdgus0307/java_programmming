package techit;

public class Conditional {

    public static void main(String[] args) {

        // if

        int a = 1;
        int b = 100;

        if (a != b){
            System.out.println("a != b");
        }

        if (a==b){
            System.out.println("a==b");
        } else{
            System.out.println("else block");
        }

        // 다중 조건의 경우, 조건을 만족하는 최초의 분기만 실행!, 조건문 하나를 만족하면 조건문을 벗어남 즉, 다음 조건문을 만족하더라도 실행이 안됨
        if (a==b){
            System.out.println("a==b");
        } else if (a < b){
            System.out.println("a < b");
        } else{
            System.out.println("else");
        }


        // switch, 연산된 값에 맞는 case를 실행시킴.

        int c = 10;

        switch (c + 1){

            case 9:
                System.out.println("c + 1 == 9");
            case 10:
                System.out.println("c + 1 == 10");
            case 11:
                System.out.println("c + 1 == 11");
            default:
                System.out.println("defalut");


            // 순서를 바꾸었더니 모든 case가 다 출력됨. case를 끝내고 싶다면 break키워드를 작성해줘야함
//            case 11:
//                System.out.println("c + 1 == 11");
//                break;
//            case 10:
//                System.out.println("c + 1 == 10");
//            case 9:
//                System.out.println("c + 1 == 9");
        }


    }
}
