package floow.loops;

public class exercise6_3 {

	public static void main(String[] args) {

		int i = 0;
		int n = (int) (Math.random() * 21) + 1;
		System.out.println(n);

		for (i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.printf("%d is the last one", i);
	}

}
