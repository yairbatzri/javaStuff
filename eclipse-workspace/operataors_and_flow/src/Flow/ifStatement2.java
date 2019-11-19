package Flow;

public class ifStatement2 {

	public static void main(String[] args) {

		int age = (int) (Math.random() * 50) + 10;

		if (age < 18) {
			System.out.printf("Age: %d, Can't drive...", age);

		}

	}

}
