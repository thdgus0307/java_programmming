package PowerJava.Ch5;


class MyMetric {
    public static double killoToMile(double x){
        return x*0.621371;

    }
    public static double mileToKillo(double y){
        return y/0.621371;
    }
}
public class MyMetricTest {
    public static void main(String[] args) {
        System.out.println("1km를 마일로 바꾸면 "+ MyMetric.killoToMile(1));
        System.out.println("0.621371를 킬로미터로 바꾸면 "+ MyMetric.mileToKillo(0.621371));
    }
}
