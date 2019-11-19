package floow.loops;

import java.util.Arrays;

public class ecercise7_1 {

	public static void main(String[] args) {

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			int randomnumber = (int) (Math.random() * 99);
			array[i] = randomnumber;
		}

		System.out.println(Arrays.toString(array));

		int sum = 0;
		for (int current : array) {
			sum += current;

		}
		System.out.printf("sum is: %d\n", sum);

		int avg = sum / array.length;
		System.out.printf("avg is: %d", avg);

	}

}
