package FlowChartHM;

public class page15E6 {

	public static void main(String[] args) {

		int salary = (int) (Math.random() * 3000) + 3000;

		if (salary * 1.10 <= 6000) {
			int salary2 = (int) (salary * 1.10);
			System.out.printf("The employee old salary: %d NIS," + " and his new salary: %d NIS", salary, salary2);

		} else {
			int salary2 = (int) (salary * 1.05);
			System.out.printf("The employee new salary is %d NIS", salary2);
			System.out.printf("The employee old salary: %d NIS," + " and his new salary: %d NIS", salary, salary2);

		}

	}

}
