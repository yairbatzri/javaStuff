package floow.loops;

public class exercise6_6 {

	public static void main(String[] args) {

		int r, sum = 0, temp;
		int n = (int) (Math.random() * 99999) + 1;
		System.out.println(n);

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}

}
