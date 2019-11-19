package floow.loops;

public class exercise6_2 {

	public static void main(String[] args) {

		int min = (int) (Math.random() * 50) + 11;
		int max = (int) (Math.random() * 50) + 11;

		while (min <= max) {
			System.out.println(min);
			min++;

		}

	}

}