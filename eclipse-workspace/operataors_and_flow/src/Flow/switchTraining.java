package Flow;

public class switchTraining {

	public static void main(String[] args) {

		int age = (int) (Math.random() * 10) + 18;

		switch (age) {

		case 18:
			System.out.printf("Age: %d, 18 message", age);
			break;

		case 20:
			System.out.printf("Age: %d, 19-21 message", age);
			break;

		case 24:
			System.out.printf("Age: %d, 24 message", age);
			break;

		default:
			System.out.println("else...");

		}

	}

}
