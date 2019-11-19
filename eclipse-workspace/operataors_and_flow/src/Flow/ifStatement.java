package Flow;

public class ifStatement {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 11) + 1;

		if (random < 5) {

			System.out.printf("%d is less than 5", random);
		} else {
			System.out.printf("%d is more than 5", random);
		}
	}
}
