package techit;

public class Project {
    public static void main(String args[]){
        long lightspeed;
        long distance;

        lightspeed = 300000;
        distance = lightspeed * 365L * 24 * 60 * 60;

        System.out.println("빛이 일년 동안 가는 거리 :" +distance + "km.");
    }
}
