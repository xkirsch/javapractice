package infopulse.beginnertask.ifelse;

public class CompareNumbers { //метод для решения задачи If6
	public static void findBiggerNumber(int a, int b) {
		if (a > b) {
			System.out.println("Number " + a + " is bigger.");
		} else {
			System.out.println("Number " + b + " is bigger.");

		}
	}


	public static void SumBiggestNumbers(int a, int b, int c) { //метод для решения задачи If15
		int minimalNumber = Math.min(a, Math.min(b,c));
		if (minimalNumber == a) {System.out.println("Sum of the largest numbers = "+ (b+c)+".");
		if (minimalNumber == b) {System.out.println("Sum of the largest numbers = "+ (a+c)+".");
		if (minimalNumber == c) {System.out.println("Sum of the largest numbers = "+ (a+b)+".");
		
		}
		}
		}

	}
}