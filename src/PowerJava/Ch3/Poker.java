package PowerJava.Ch3;

public class Poker {
    public static void main(String[] args) {
        String[] shapes = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] numbers = {"2","3","4","5","6","7", "8","9","10","Jack","Queen","King","Ace"};

        for(int i=0; i<5; i++)
        {
            int j = (int)(Math.random()*3);
            int x = (int)(Math.random()*12);
            System.out.println(shapes[j]+"의 "+numbers[x]);
        }
    }
}
