package PowerJava.Ch3;

public class PE3_6 {
    public static void main(String[] args) {
        System.out.println("2부터 100 사이 모든 소수 :");
        for(int i = 2; i<=100;i++) {
            String state = "pr";
            for (int j = 2; j <= 100; j++) {
                if (i != j && i % j == 0) {
                    state = "nonpr";
                }
            }
            if(state.equals("pr"))
                System.out.print(" "+ i);
        }
    }
}
