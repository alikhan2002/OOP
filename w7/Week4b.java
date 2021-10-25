import java.util.*;
class Student{
	public String name;
	int n = 100 + new Random().nextInt(900);
	public String  ID = "20B00" + Integer.toString(n);
	private double gpa;
	String specialty;
	private int scholarship;
	public int tot_credits;

 public Student(String name, String specialty, int tot_credits){
		this.name = name;
		this.specialty = specialty;
		this.tot_credits = tot_credits;
	}
	public String getName() {
		return name;
	}
	public int getAmountOfCredits() {
		return tot_credits;
	}
	public String getID() {
		return ID;
	}
	public double getGPA(){return gpa;}

	public void setGPA(double g){gpa = g;}

	static void changeNumber(int a){ // a = x = 5
		a = 10;
	}
	public int getScholarship(){
		return scholarship;
	}
	public void setScholarship( int scholarship) {
		this.scholarship = scholarship;
	}

	public int amount_of_credits() {
		return tot_credits;
	}
	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}

}
public class Week4b{
public static void main(String[] args) {
		Student s1 = new Student("Alikhan", "IS", 19);
		s1.setScholarship(31168);
		s1.setGPA(3.5);
		University university = new University();
		System.out.println(university.getStudentName(s1));
		System.out.println(university.getID(s1));
		System.out.println(university.getStudentGPA(s1));
		System.out.println(university.getStudentAmountOfCredits(s1));
		System.out.println(university.getStudentScholarship(s1));
		// Student s1 = new Student();
		// System.out.println(s1.name);
		// System.out.println(s1.specialty);
		// System.out.println(s1.getGPA());
		// System.out.println(s1.getScholarship());
		// System.out.println(s1.amount_of_credits());

		// double d = s1.getGPA();
		// s1.setGPA(3.5);
		// System.out.println(s1.getGPA());

		// System.out.println(s1.name);
		// Student.changeName(s1);
		// System.out.println(s1.name);
	}
}

/*
TASK-1: Add at least 2 more data fields with different access modifiers
TASK-2: Add at least 2 more methods with different access modifiers
TASK-3: Create a class University that includes Student as a data field (group of students, if possible)
*/