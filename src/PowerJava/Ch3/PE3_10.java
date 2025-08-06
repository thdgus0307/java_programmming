package PowerJava.Ch3;

public class PE3_10 {
    public static void main(String[] args) {
        double[] num = {1.0, 2.0, 3.0, 4.0};
        double sum =0;
        double max = 0;
        for(double obj:num)
        {
            System.out.print(obj+" ");
            sum += obj;
        }
        System.out.println();
        System.out.println("합은 "+sum);

        for(int i =0; i<3; i++) {
            if (num[i] < num[i + 1])
                max = num[i + 1];
            else
                max = num[i];

        }
        System.out.print("최대값은 "+ max);


    }


}
