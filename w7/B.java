import java.util.Scanner;

public class B{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		i = input.nextInt();
		System.out.println(i);
		Car cars = new Car();

		System.out.println(cars.name);
		System.out.print(cars.model);

	}
}