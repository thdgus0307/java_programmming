package PowerJava.Ch4;

public class Dice {
    private int value;

    public Dice(){
        value =0 ;
    }

    public int getValue(){return value;}
    public void setValue(int value){ this.value = value;}

    public int roll(){
        return  (int)(java.lang.Math.random()*5)+1;
    }

    public static void main(String[] args) {

        int sum;
        int count =0;
        Dice obj1 = new Dice();
        Dice obj2 = new Dice();

        do {
            sum = 0;
            obj1.setValue(obj1.roll());
            obj2.setValue(obj2.roll());
            sum = obj1.getValue() + obj2.getValue();

            System.out.println("주사위1="+obj1.getValue()+" 주사위2="+obj2.getValue());
            count++;
        } while (sum != 2);
        System.out.println("(1,1)이 나오는데 걸린 횟수="+count);
    }
}
