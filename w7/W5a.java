final class Student{
	private String name;
	public static String id = "20B5164981";
	private double gpa = 4;
	String specialty;
	static int counter = 0;
	Student () {}
	Student(String n){
		name = n;
	}

	public double getGPA(){return gpa;}

	public void setGPA(double gpa){
		this.gpa = gpa;	// local gpa = own value = 2
		System.out.println("GPA: " + gpa); 
	}

	static void changeNumber(int s){ // a = x = 5
		s = 10;
	}

	static void changeName(Student s){ // s = s1
		s.name = "Almas";
	}
	static void sameName(Student[] arr_1, Student[] arr_2) {
		for(int i = 0; i < 10; i++) {
			for(int j = i; j < 10; j++) {
				if(arr_1[i] != null && arr_2[j] != null){
					if(arr_1[i].getName() == arr_2[j].getName()){
						System.out.println(arr_1[i].getName());
						counter++;
					}
				}	
			}	
		}		
		System.out.println(counter);
	}

	public String getName(){
		return this.name;
	}

	public void printStudent(){
		System.out.println("Student: " + name);
	}
}

public class W5a{
	public static void main(String[] args) {

		Student[] students_KBTU = new Student[10];
		Student[] students_SDU = new Student[10];

		students_KBTU[0] = new Student("Alikhan");
		students_KBTU[1] = new Student("Nurik");
		students_KBTU[2] = new Student("Shurik");
		students_KBTU[3] = new Student("Almas");
		students_KBTU[4] = new Student("Qanat");

		students_SDU[0] = new Student("Alikhan");
		students_SDU[3] = new Student("Tot");
		students_SDU[5] = new Student("Fali");
		students_SDU[7] = new Student("Nurik");
		students_SDU[9] = new Student("Defacto");

		Student.sameName(students_KBTU, students_SDU);

		Student students = new Student();

		students.id = "20B35165498";

		System.out.println(students.id);
		// for(int i = 0; i < ; i++) {
		// 	System.out.println(students_KBTU[i].getName());
		// }
		// for(int i = 0; i < 10; i++) {
		// 	if(students_SDU[i] != null)
		// 	System.out.println(students_SDU[i].getName());
		// }

	}
}
/*
TASK-1: Create two groups of students (2 arrays), and initialize them;
TASK-2: Create a static method that compares two student arrays, 
		and returns how many students from 2 have the same name;
TASK-3: Modify the Student to make it an immutable class;
TASK-4: Create the Classes Course and Faculty, 
		and demonstrate their relationships to the Student class like in the lecture slides.
*/
