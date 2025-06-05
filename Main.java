public class Main {
     public static void main(String[] args) {
    Student std=new Student("sneka",101);
    std.displayDetails();
    std.ChangeSchilName("Holly Cross");

    CalculateSalary cs=new CalculateSalary("Sneka",10000.00,5000.00);
    cs.calculatgeSalary();
    cs.display();

     StudentAdmission s1 = new StudentAdmission("Sneka", 101);
        StudentAdmission s2 = new StudentAdmission("Ragu", 102);

        s1.displauStudentDetails();
        s2.displauStudentDetails();

        // Static method called using class name
        StudentAdmission.displayTotalStudents();
}
}
