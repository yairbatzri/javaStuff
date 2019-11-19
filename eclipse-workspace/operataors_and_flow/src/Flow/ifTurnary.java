package Flow;

public class ifTurnary {

	public static void main(String[] args) {

		int age = (int) (Math.random() * 50) + 10;

		String message = (age < 18) ? "Can't Drive..."
				: (age >= 18 && age < 21) ? "Army driver..."
						: (age >= 21 && age < 24) ? "Travel to India..." : "Ping pong player...";

		System.out.printf("Your age is %d, and you're %s", age, message);

	}

}
