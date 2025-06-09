public class Main {
        public static void main(String[] args) {
                // object creation and call the method for student class
                Student std = new Student("sneka", 101);
                std.displayDetails();
                std.ChangeSchilName("Holly Cross");

                // object creation and call the method for calculate salary class
                CalculateSalary cs = new CalculateSalary("Sneka", 10000.00, 5000.00);
                cs.calculatgeSalary();
                cs.display();

                // object creation and call the methods for student admission class
                StudentAdmission s1 = new StudentAdmission("Sneka", 101);
                StudentAdmission s2 = new StudentAdmission("Ragu", 102);

                s1.displauStudentDetails();
                s2.displauStudentDetails();
                // Static method called using class name
                StudentAdmission.displayTotalStudents();

                // object creation and call the method for shape class
                Circle c = new Circle();
                Rectangle r = new Rectangle();
                c.display();
                System.out.println("The area of Circle is: " + c.calculateArea());
                r.display();
                System.out.println("The area of Rectangle is: " + r.calculateArea());

                // object creation and call the methods for employee
                FullTimeEmployee fullTmeEmp = new FullTimeEmployee(1, "Sneka");
                fullTmeEmp.displayEmpDetails();
                System.out.println("salary: " + fullTmeEmp.calcSalary());
                ParttimeEmployee partTmeEmp = new ParttimeEmployee(2, "Ragu");
                partTmeEmp.displayEmpDetails();
                System.out.println("salary: " + partTmeEmp.calcSalary());

                // object creation and call the methods for payment
                CreditCardPayment credit = new CreditCardPayment();
                credit.makePayment(10000);
                UPIPayment upi = new UPIPayment();
                upi.makePayment(1000);
        }
}
