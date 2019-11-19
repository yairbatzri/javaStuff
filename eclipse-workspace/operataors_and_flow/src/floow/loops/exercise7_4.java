package floow.loops;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter number");
			numbers[i] = input.nextInt();

			System.out.println(Arrays.toString(numbers));
		}

		int[] reverse = new int[5];
		for (int j = 0; j < reverse.length; j++) {
			int temp = numbers[j];
			reverse[j] = numbers[numbers.length - j - 1];
			numbers[numbers.length - j - 1] = temp;

		}
		System.out.println(Arrays.toString(reverse));

	}

}
