package floow.loops;

public class training {

	public static void main(String[] args) {

		int x = 0;

		while (x <= 10) {

			int y = 0;
			while (y <= 10) {
				System.out.printf("x: %d,Y: %d\n", x, y);

				y++;

			}
			x++;

		}
	}
}