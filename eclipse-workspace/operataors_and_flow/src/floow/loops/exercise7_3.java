package floow.loops;

import java.util.Arrays;

public class exercise7_3 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Integer[] numbers = new Integer[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(numbers));

		Object[] noDuplicates = Arrays.stream(numbers).distinct().toArray();
		System.out.println(Arrays.toString(noDuplicates));

	}
}