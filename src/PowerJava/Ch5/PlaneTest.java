package PowerJava.Ch5;

import java.util.Scanner;

class Plane{
    private int num;
    private String model;
    private int passenger;
    static int planes;

    public int getNum(){return num;}
    public void setNum(int num){this.num = num;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public int getPassenger() {return passenger;}
    public void setPassenger(int passenger) {this.passenger = passenger;}
    public Plane(int num, String model, int passenger){
        this.num = num;
        this.model = model;
        this.passenger = passenger;
        planes++;
    }
    public int getPlanes(){return planes;}


}
public class PlaneTest {
    public static void main(String[] args) {
        Plane obj1 = new Plane(1,"aa",200);
        Plane obj2 = new Plane(2,"bb", 300);
        Plane obj3 = new Plane(3,"cc",150);

        System.out.println("식별번호:"+obj1.getNum()+" 모델:"+obj1.getModel()+" 승객수:"+obj1.getPassenger());
        System.out.println("식별번호:"+obj2.getNum()+" 모델:"+obj2.getModel()+" 승객수:"+obj2.getPassenger());
        System.out.println("식별번호:"+obj3.getNum()+" 모델:"+obj3.getModel()+" 승객수:"+obj3.getPassenger());

        System.out.println("생성된 비행기의 개수:"+obj1.getPlanes());

    }
}
