public class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(){};
	

	public void sayName() {
		System.out.println(name);
	}
}