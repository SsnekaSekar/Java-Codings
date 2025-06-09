public abstract class Employee {
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract int calcSalary();

    public void displayEmpDetails() {
        System.out.println("The employee id is: " + id);
        System.out.println("The employee name is: " + name);
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name) {
        super(id, name);      
    }

    @Override
    public int calcSalary() {
        int numOfWorkingDays = 30;
        int salaryPerday = 1200;
        int monthlySalary = numOfWorkingDays * salaryPerday;
        return (monthlySalary);
    }

}

class ParttimeEmployee extends Employee {

    public ParttimeEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public int calcSalary() {
        int hourlyRate = 100;
        int hoursWorked = 500;
        int Salary = hourlyRate * hoursWorked;
        return (Salary);
    }

}

