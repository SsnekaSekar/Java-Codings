public class CalculateSalary {
    String name;
    double basicSalary;
    double bonus;
    double totalSalary;

    public CalculateSalary(String name, double basicSalary,double bonus){
        this.name=name;
        this.basicSalary=basicSalary;
        this.bonus=bonus;
    }

    public void calculatgeSalary(){
        totalSalary=basicSalary+bonus;
        System.out.println("total salary is: "+totalSalary);
    }

    public void display(){
        System.out.println("employee name is: "+name);
        System.out.println("employee basic salary is: "+basicSalary);
        System.out.println("employee bonus is: "+bonus);
        System.out.println("employee total salary is: "+totalSalary);
    }
}


