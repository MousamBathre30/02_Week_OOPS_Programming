
class Student{
  static int totalstudent = 0;
  String name;
  Student (String name){
    this.name = name;
	totalstudent++;
  }
  
  static void displayTotalStudents(){
    System.out.println("Total Students: " + totalstudent);
  }
 public void diplayname(){
	 System.out.println( name);
 }

  public static void main(String args[]){
   Student s =  new Student("Alice");
	Student s1 = new Student("Bob");
	s.diplayname();
	s1.diplayname();
	Student.displayTotalStudents(); // diplay total student: 2;
  }
}