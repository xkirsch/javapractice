package infopulse.beginnertask.switches;

public class CardIdentifier {
	public static void cardSuitName(int n, int m) {

		switch (n) {
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;
		case 10:
			System.out.print("Ten");
			break;
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		case 14:
			System.out.print("of Hearts");
			break;

		}

		switch (m) {
		case 1:
			System.out.println(" of Spades");
			break;
		case 2:
			System.out.println(" of Clubs");
			break;
		case 3:
			System.out.println(" of Diamonds");
			break;
		case 4:
			System.out.println(" of Hearts");
			break;
		}

	}
}