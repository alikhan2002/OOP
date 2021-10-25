public class Employee{
	public String name;
	public int age;
	public double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void printEmployee(){
		System.out.println("Name: "+ name );
	  	System.out.println("Age:" + age );
	  	System.out.println("Salary:" + salary);
   }

}