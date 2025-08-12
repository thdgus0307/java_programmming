package PowerJava.Ch4;


class Circle2{
    int radius;
    String color;

    double calcArea(){
        return 3.14 * radius * radius;
    }
}
public class CircleTest2 {
    public static void main(String[] args) {
        Circle2 obj1;
        Circle2 obj2;
        obj1 = new Circle2();
        obj2 = new Circle2();
        obj1.color="red";
        obj1.radius=100;
        obj2.radius=200;
        obj2.color="blue";
    }
}
