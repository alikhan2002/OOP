public class Test{
	public static void main(String[] args) {
		Statics car = new Statics();
		System.out.println(Statics.statics);

		Statics.statics += 5;
		System.out.println(Statics.statics);
		car.not_static += 5;
		System.out.println(car.not_static);

		Statics car_2 = new Statics();
		System.out.println(car_2.not_static);

	}
}