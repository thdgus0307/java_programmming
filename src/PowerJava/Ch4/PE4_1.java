package PowerJava.Ch4;

class Student{
    public String name;
    public int rollno;
    public int age;

}
public class PE4_1 {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.name = "kim";
        obj.rollno=201800001;
        obj.age=20;

        System.out.println("학생의 이름:"+obj.name);
        System.out.println("학생의 학번:"+obj.rollno);
        System.out.println("학생의 나이:"+obj.age);
    }

}
