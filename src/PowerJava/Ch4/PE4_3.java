package PowerJava.Ch4;

import java.util.Scanner;

class Date{
    public int year, date, month;

    public void print1(){
        System.out.println(year+"."+month+"."+date);
    }
    public void print2(){
        String ms = null;
        switch (month) {
            case 1:
                ms = "January";
                break;
            case 2:
                ms = "February";
                break;
            case 3:
                ms = "March";
                break;
            case 4:
                ms = "April";
                break;
            case 5:
                ms = "May";
                break;
            case 6:
                ms = "June";
                break;
            case 7:
                ms = "July";
                break;
            case 8:
                ms = "August";
                break;
            case 9:
                ms = "September";
                break;
            case 10:
                ms = "October";
                break;
            case 11:
                ms = "November";
                break;
            case 12:
                ms = "December";
                break;
            default:
                break;
        }

        System.out.println(ms+" "+date+", "+year);
    }
}
public class PE4_3 {
    public static void main(String[] args) {
        Date obj = new Date();
        obj.date=12;
        obj.year=2012;
        obj.month=7;
        obj.print1();
        obj.print2();

    }
}
