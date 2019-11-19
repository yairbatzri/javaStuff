package Flow;

public class NesdtedIfTraining {

	public static void main(String[] args) {

		String name = "avi";
		int age = 21;

		if (age == 18) {

			if (name.equals("avi")) {
				System.out.println("avi is 18yo");
			}
		} else {
			if (name.equals("avner")) {
				System.out.println("avner is 18yo");
			} else {
				if (name.startsWith("a")) {
					System.out.println("starting with A");
				}
			}

		}

	}

}
