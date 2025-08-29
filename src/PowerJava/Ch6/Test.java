package PowerJava.Ch6;

class Shape2{
    public Shape2(){
        System.out.println("shape 생성자()");
    }
}

class Rectangle extends Shape2{
    public Rectangle(){
        super();//명시적 호출
        System.out.println("Rectangle 생성자()");
    }
}
public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    }
}
