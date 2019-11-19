package Array;

import java.util.Arrays;

public class fromPDFt7 {

	public static void main(String[] args) {

		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			int randomNumber = (int) (Math.random() * 10);
			intArray[i] = randomNumber;
		}

		System.out.println(Arrays.toString(intArray));

		int sum = 0;
		for (int current : intArray) {
			sum += current;

		}
		System.out.printf("sum is: %d\n", sum);

		int avg = sum / intArray.length;
		System.out.printf("avg is: %d", avg);

	}

}
