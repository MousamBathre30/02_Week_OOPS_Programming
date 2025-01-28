package problemStatement.employeeManagementSystem;

class PartTimeEmployee extends Employee implements  Department{
   int workour = 10;
   int fixedSalary = 500;

   PartTimeEmployee(String employeeID , String name , int baseSalary){
       super(employeeID ,  name ,  baseSalary);
   }
    public void calculateSalary(){
        System.out.println("Calculate Salary is " + (fixedSalary + 10* workour));
    }

    @Override
    public void assignDepartment() {
        System.out.println("Your DepartMent is PART-TIME");
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("DepartMent Details ");
        System.out.println("WorkOur is " + workour);
        System.out.println("Fixed Salary is " + fixedSalary);
    }
}
