package PowerJava.Ch6;

class Shape4 {
    protected int x,y;
}

interface Drawable2{
    void draw();
}
class Circle4 extends Shape4 implements Drawable2{
    int radius;
    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
public class TestInterface2 {
    public static void main(String[] args) {
        Drawable2 obj = new Circle4();
        obj.draw();
    }
}
