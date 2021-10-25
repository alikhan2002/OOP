public class University{
	private Student student;

	public String getStudentName(Student student) {
		return student.getName();
	}
	public double getStudentGPA(Student student) {
		return student.getGPA();
	}
	public int getStudentScholarship(Student student) {
		return student.getScholarship();
	}
	public int getStudentAmountOfCredits(Student student) {
		return student.getAmountOfCredits();
	}
	public String getID(Student student) {
		return student.getID();
	}
}