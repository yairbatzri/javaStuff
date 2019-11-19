package floow.loops;

public class exercise6_4 {

	public static void main(String[] args) {

		int max = (int) (Math.random() * 30) + 1;
		int den = (int) (Math.random() * 10) + 1;
		int i = 0;
		System.out.printf("Max: %d\nDen: %d\n", max, den);

		for (i = 0; i <= max; i++) {
			if (i / den != 0) {
				System.out.println(i);

			}

		}

	}
}
