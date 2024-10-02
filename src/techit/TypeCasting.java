package techit;

public class TypeCasting {
    public static void main(String[] args) {

        // 형변환
        // byte < short < int < long <<< float < double

        // 강제 형변환
        int a = 128;
        short b = (short)a;
        byte c = (byte)a; // -128 ~ 127
        // short보다 int가 범위가 더 넓어서 불가능함. 그래서 앞에 괄화하고 형을 써줘야함.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); // -128이 출력됨. 127 다음이 없어서 다시 처음으로 돌아가기때문에 -128이 출력됨.

        // 자동 형변환
        short x = 10;
        int y = x;

        System.out.println(x);
        System.out.println(y); // int가 short보다 넓은 범위라서 가능함

        int m = 80;
        double n = m;

        System.out.println(m);
        System.out.println(n);

        double d = 10.3312356;
        float e = (float) d;

        System.out.println(d);
        System.out.println(e);

        int f = 10;
        short g = 20;

        short h = (short)(f + g);
        System.out.println(h);

    }
}
