package FlowChartHM;

public class howManyDigitsInNumber {

	public static void main(String[] args) {

		int n = 432450;
		int counter = 0;

		while (n > 1) {
			n = (int) n / 10;
			counter++;

		}
		System.out.printf("Numnber of digits: %d", counter);
	}

}
