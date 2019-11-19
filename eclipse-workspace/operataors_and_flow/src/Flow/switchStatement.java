package Flow;

public class switchStatement {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 20) + 1;

		number = 15;

		switch (number) {

		case 1:
			System.out.println("1");
			break;

		case 2:
			System.out.println("2");
			break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:

		case 15:
			System.out.println("15");
			break;

		default:
			System.out.println("defalut");

		}

	}

}
