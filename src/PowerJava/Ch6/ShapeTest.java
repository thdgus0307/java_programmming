package PowerJava.Ch6;

class Shape3{
    protected int x,y;

    public void draw(){
        System.out.println("Shape Draw");
    }
}
class Rectangle2 extends Shape3{
    private int width, height;
    @Override
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape3{
    private int base, height;
    @Override
    public void draw(){
        System.out.println("Triangle Draw");
    }
}

class Circle2 extends Shape3{
    private int radius;

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
public class ShapeTest {
    public static void main(String[] args) {
//        Shape3 s1, s2;
//
//         s1 = new Shape3();
//         s2 = new Rectangle2(); // 상향형변환
//        Shape3 s = new Rectangle2();
//        Rectangle2 r = new Rectangle2();
//        s.x=0;
//        s.y=0;
//        s.width=100; // 컴파일 오류 발생함.

        Shape3 arrayOfShapes[] = new Shape3[3];
        arrayOfShapes[0] = new Rectangle2();
        arrayOfShapes[1]= new Triangle();
        arrayOfShapes[2]= new Circle2();
        for(int i =0; i<arrayOfShapes.length;i++){
            arrayOfShapes[i].draw();
        }
    }
}
