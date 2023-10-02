class Student{
    String name;
    int rollno;
    int marks;
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student ashutosh = new Student();
        ashutosh.name = "Ashutosh Pandey";
        ashutosh.rollno = 1;
        ashutosh.marks = 100;

        System.out.println(ashutosh.name+" "+ashutosh.marks+" "+ashutosh.rollno);
    }
}