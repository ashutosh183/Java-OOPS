class Student{
    String name;
    int rollno;
    int marks;
    Student(){

    }
    Student(int newMarks, int rollNo, String Name){
        marks = newMarks;
        rollno = rollNo;
        name = Name;
    }
    void study(String subject){
        System.out.println("The student is studying "+subject);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student ashutosh = new Student(100, 1, "Ashutosh Pandey");
        ashutosh.study("DSA & LLD");
        System.out.println(ashutosh.name+" "+ashutosh.marks+" "+ashutosh.rollno);
    }
}