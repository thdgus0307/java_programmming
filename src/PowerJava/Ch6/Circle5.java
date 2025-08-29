package PowerJava.Ch6;

interface Printable{
    void print();
}
interface Drawable3{
    void draw();
}
public class Circle5 implements Printable, Drawable3 {
    @Override
    public void print() {
        System.out.println("프린터로 원을 출력합니다.");
    }

    @Override
    public void draw() {
        System.out.println("화면에 원을 그립니다.");
    }

    public static void main(String[] args) {
        Circle5 obj = new Circle5();
        obj.draw();
        obj.print();
    }
}
