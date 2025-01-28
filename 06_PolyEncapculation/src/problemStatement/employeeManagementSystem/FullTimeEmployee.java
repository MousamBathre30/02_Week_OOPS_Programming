package problemStatement.employeeManagementSystem;

 class FullTimeEmployee extends Employee implements  Department{

     int workOur=10;
     int fixedSalary = 1000;

     FullTimeEmployee(String employeeID , String name , int baseSalary){
         super(employeeID ,  name ,  baseSalary);
     }
     public void calculateSalary(){
         System.out.println("Calculate Salary is " + (fixedSalary + 10* workOur));
     }

     @Override
     public void assignDepartment() {
         System.out.println("Your DepartMent is Full-TIME");
     }

     @Override
     public void getDepartmentDetails() {
         System.out.println("DepartMent Details ");
         System.out.println("WorkOur is " + workOur);
         System.out.println("Fixed Salary is " + fixedSalary);

     }
}
