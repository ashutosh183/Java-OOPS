class Student{
    String name;
    int rollno;
    int marks;

    void study(String subject){
        System.out.println("The student is studying "+subject);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student ashutosh = new Student();
        ashutosh.name = "Ashutosh Pandey";
        ashutosh.rollno = 1;
        ashutosh.marks = 100;
        ashutosh.study("DSA & LLD");
        System.out.println(ashutosh.name+" "+ashutosh.marks+" "+ashutosh.rollno);
    }
}