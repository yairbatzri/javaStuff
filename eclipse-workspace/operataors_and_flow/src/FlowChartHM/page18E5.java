package FlowChartHM;

import java.util.Scanner;

public class page18E5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter your name:");
		String name = input.nextLine();

		System.out.println("Enter your monthly salary:");
		int salary = input.nextInt();

		input.close();

		int tax = 0;

		double message = (salary <= 23000) ? tax = (int) (salary * 0.1)
				: (salary <= 46000) ? tax = (int) (salary * 0.2)
						: (salary <= 120000) ? tax = (int) (salary * 0.3)
								: (int) ((salary <= 220000) ? tax = (int) (salary * 0.4) : (int) (salary * 0.5));

		System.out.printf("%s is a milioner that pais tax fee of %d NIS per month. What a dog!", name, tax);
	}

}
