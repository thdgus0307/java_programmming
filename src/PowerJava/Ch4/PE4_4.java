package PowerJava.Ch4;

class ComplexNum {
    int real;
    int image;

    void print(){
        System.out.println(real+"+"+image+"i");
    }
}
public class PE4_4 {
    public static void main(String[] args) {
        ComplexNum obj = new ComplexNum();
        obj.image=10;
        obj.real=20;
        obj.print();
    }
}
