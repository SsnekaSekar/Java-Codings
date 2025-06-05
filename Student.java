
public class Student {

    public String name;
    public int rollNo;
    public static String schlName = "ABC Public School";   

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student School Name: " + schlName);
    }

    public void ChangeSchilName(String school) {
        schlName = school;
        System.out.println("The new school name: " + schlName);
    }
}