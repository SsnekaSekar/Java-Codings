public class StudentAdmission {
    String name;
    int rollNo;
    static int studentCount;    

      public StudentAdmission(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        studentCount++; 
    }

    public void displauStudentDetails(){
        System.out.println("Student Name is: "+name);
        System.out.println("Student RollNo is: "+rollNo);
    }

    public static void  displayTotalStudents(){
        System.out.println("The total student count is:" +studentCount);
    }
}

