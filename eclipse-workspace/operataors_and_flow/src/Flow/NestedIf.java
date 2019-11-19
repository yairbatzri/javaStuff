package Flow;

public class NestedIf {

	public static void main(String[] args) {

		String name = "avi";
		int age = 28;

		if (name.equals("avi")) {
			System.out.println("is avi");
			if (age == 28) {
            System.out.println("is 28");
			} else {
		
				if (4 == 34) {
					System.out.println("what?!");
				}
			}
		}

	}
}
