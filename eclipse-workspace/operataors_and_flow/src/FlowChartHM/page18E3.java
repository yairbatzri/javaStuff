package FlowChartHM;

public class page18E3 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11) + 1;
		int y = (int) (Math.random() * 11) + 1;
		int z = (int) (Math.random() * 11) + 1;
		int max = 0;

		System.out.printf("x:%d ,y:%d, z:%d\n", x, y, z);

		if (x > y) {
			max = x;
		} else {
			max = y;

			System.out.printf("after check num.1 - max = %d", max);

			if (z > max) {
				System.out.println(z);

			} else {
				System.out.println(max);
			}

		}
	}
}
