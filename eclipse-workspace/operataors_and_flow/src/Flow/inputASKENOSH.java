package Flow;

import java.util.Scanner;

public class inputASKENOSH {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your name");
		String name = input.nextLine();

		System.out.printf("Hello %s\nPlease enter your age\n", name);

		int age = input.nextInt();
		System.out.printf("Your age is %d\nPlease tell me what's your fav color?\n", age);
		input.hasNextLine();

		String favColor = input.nextLine();
		System.out.println(favColor);

	}

}
