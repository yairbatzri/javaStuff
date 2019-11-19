package Array;

import java.util.Random;
import java.util.Scanner;

public class missionCards {

	public static void main(String[] args) {

		Random nowCard = new Random();

		Scanner input = new Scanner(System.in);
		System.out.println("player 1- Enter Your name");
		String player1 = input.nextLine();
		System.out.println("player 2- Enter Your name");
		String player2 = input.nextLine();

		System.out.printf("Hello %s and %s\n", player1, player2);

		int[] yairCards = new int[26];
		int[] zoharCards = new int[26];
		int zoharPoints = 0;
		int yairPoints = 0;

		for (int i = 0; i < yairCards.length; i++) {

			zoharCards[i] = nowCard.nextInt(13) + 1;
		}

		for (int j = 0, i = 0, k = 0; j < zoharCards.length && i < yairCards.length; j++, i++, k++) {
			if (zoharCards[i] > yairCards[i]) {
				System.out.printf("Round %d: Zohar - %d,Yair - %d.Zohar wins!\n", i, zoharCards[i], yairCards[i]);
				zoharPoints++;
			} else if (zoharCards[i] < yairCards[i]) {
				yairPoints++;
				System.out.printf("Round %d: Yair - %d,Zohar: %d.Yair wins!\n", i, yairCards[i], zoharCards[i]);

			} else {
				System.out.printf("It's a tie at round %d\n", k);
				i += 2;
				j += 2;
				if (j >= zoharCards.length) {
					System.out.printf("game over...");
					break;
				}
				if (zoharCards[i] > yairCards[i]) {
					System.out.printf("Round %d: Zohar - %d,Yair - %d.Zohar wins!\n", i, zoharCards[i], yairCards[i]);
					zoharPoints += 2;
				} else {
					yairPoints += 2;
					System.out.printf("Round %d: Yair - %d,Zohar: %d.Yair wins!\n", i, yairCards[i], zoharCards[i]);

				}
			}
		}

		{
			if (zoharPoints > yairPoints) {
				System.out.printf("Zohar: %d - Yair: %d...Zohar is the winner!\n", zoharPoints, yairPoints);

			} else {
				System.out.printf("Yair: %d - Zohar: %d...Yair is the winner!\n", yairPoints, zoharPoints);

			}
		}

	}
}
