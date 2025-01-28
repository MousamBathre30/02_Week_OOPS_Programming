package problemStatement.employeeManagementSystem;

public class Main {

    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee("0D1", "mousam" , 200);

        f1.assignDepartment();
        f1.getDepartmentDetails();
        f1.calculateSalary();
        f1.displayDetails();

        System.out.println();


        PartTimeEmployee p1 = new PartTimeEmployee("0P1", "Goutam" , 900);

        p1.assignDepartment();
        p1.getDepartmentDetails();
        p1.calculateSalary();
        p1.displayDetails();

    }
}
