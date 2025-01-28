package problemStatement.employeeManagementSystem;

abstract class Employee {
    private String employeeID;
    private String name;
    private int baseSalary;


    Employee(String employeeID , String name , int baseSalary){
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void setEmpIDnameBaseSalary(String employeeID , String name , int baseSalary){
        this.employeeID = employeeID;
        this.name = name;

        if(baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    public String getterName(){
        return name;
    }
    public String getterID(){
        return employeeID;
    }
    public int getterBaseSalary(){
        return baseSalary;
    }

    abstract void calculateSalary();

    public void displayDetails(){
        System.out.println("Name of the Empolyee :- " + name);
        System.out.println("Id of the Empolyee :- " + employeeID);
        System.out.println("Base Salary of the Employee :- " + baseSalary);
    }
}
