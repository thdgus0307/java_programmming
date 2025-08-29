package PowerJava.Ch6;

interface Drawable{
    void draw();
}
class Circle3 implements Drawable{
    int radius;
    public void draw(){
        System.out.println("Circle Draw");
    }

}
public class TestInterface1 {
    public static void main(String[] args) {
        Drawable obj = new Circle3();
        obj.draw();
    }
}
