package FlowChartHM;

public class page17E5 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11) + 1;
		int b = (int) (Math.random() * 11) + 1;

		System.out.printf("First number is %d\n", a);
		System.out.printf("Second number is %d\n", b);

		if (a > b) {
			System.out.printf("%d is bigger than %d", a, b);
		} else {
			System.out.printf("%d is bigger than %d", b, a);

		}

	}
}
