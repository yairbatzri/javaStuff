package floow.loops;

public class exercise6_5 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10000);
		int sum = 0;
		int counter = 0;
		int leftDig = 0;
		int mun = 0;
		System.out.println(num);

		while (num < 10) {
		}

		while (num > 0) {
			leftDig = num % 10;
			sum = sum + (int) num % 10;
			num = (int) num / 10;
			mun = num + num % 10;
			counter++;

		}
		System.out.printf("Sum: %d\n", sum);
		System.out.printf("Counter: %d\n", counter);
		System.out.printf("leftDig: %d\n", leftDig);
		System.out.printf("mun: %d", mun);

	}

}
