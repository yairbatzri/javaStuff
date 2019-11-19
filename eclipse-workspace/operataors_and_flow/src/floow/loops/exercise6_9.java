package floow.loops;

public class exercise6_9 {

	public static void main(String[] args) {

		int num = 1;
		int top = 100;

		while (num <= top) {
			int dig1 = num % 10;
			int dig10 = num / 10;
			if (dig1 == 7 || num % 7 == 0 || dig10 == 7) {
				System.out.println("BOOM");
				num++;
			} else {
				System.out.println(num);
				num++;

			}

		}
		System.out.println("GAME OVER");

	}
}
