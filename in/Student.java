public class Student extends Person{
	int course = 2;
	void tell() {
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(course);
	}

	public Student(int age, String name, int course) {
		super(name, age);
		this.course = course;
	}

}