import java.util.Scanner;

import infopulse.beginnertask.begin.*;
import infopulse.beginnertask.bool.OddNumber;
import infopulse.beginnertask.cyclesfor.CandyPrice;
import infopulse.beginnertask.integer.*;
import infopulse.beginnertask.switches.*;



public class CoreClass { 
	public static void main(String[] args) {
	// методы решения задач первой группы - NTEGER, BEGIN, BOOL
		/*
		 * double cubeEdge = 6.0; // Put this value in cm. double circleLength = 40.0;
		 * CubeCalculator calc = new CubeCalculator(); CircleCalculator circle = new
		 * CircleCalculator(); double v = calc.findVolume(cubeEdge); double s =
		 * calc.findSurface(cubeEdge); double r = circle.findRadius(circleLength);
		 * double surf = circle.findSurface(circleLength);
		 * System.out.println("Задача BEGIN 5");
		 * System.out.println("Обьем куба равен "+v);
		 * System.out.println("Площадь куба равна "+s);
		 * System.out.println("Задача BEGIN 14");
		 * System.out.println("Радиус круга равен "+r);
		 * System.out.println("Площадь круга равна "+surf); int fullSeconds = 3459;
		 * secondsToMinutes sec = new secondsToMinutes(); int m =
		 * sec.findMinutes(fullSeconds); System.out.println("Задача INTEGER 19");
		 * System.out.print("С начала суток прошло "+fullSeconds+" секунд.");
		 * System.out.println("Прошло полных "+m+" минут."); OddNumber odd = new
		 * OddNumber(); System.out.println("Задача BOOLEAN 8\n"+odd.isOddNumber(5,9));
		 * int dayOfYear = 7;
		 * System.out.println("Задача INTEGER 26\n"+DayOfTheWeekFinder.DayOftheWeek(
		 * dayOfYear));
		 */
		// Задача Case 15
		/*
		 * Scanner newCard = new Scanner(System.in);
		 * System.out.println("Enter the number from 6 to 14"); int cardName =
		 * newCard.nextInt(); if (cardName > 14 || 6 > cardName) {
		 * System.out.println("ERROR!"); } else {
		 * System.out.println("Enter the number from 1 to 4"); int cardSuit =
		 * newCard.nextInt(); if (cardSuit > 4 || 1 > cardName) {
		 * System.out.println("ERROR!"); } else { CardIdentifier.cardSuitName(cardName,
		 * cardSuit); } }
		 */
		//задача Case 6
		/*
		 * Scanner newConverter =new Scanner(System.in);
		 * System.out.println("Enter the number from 1 to 5"); int valueToConvert =
		 * newConverter.nextInt(); System.out.println("Enter the number"); double
		 * lengthInMeters = newConverter.nextDouble();
		 * LengthConverter.convertToMeters(valueToConvert, lengthInMeters);
		 */
		//задача Case 3
				
		/*
		 * Scanner newMonth = new Scanner(System.in);
		 * System.out.println("Enter the number from 1 to 12"); int numberMonth =
		 * newMonth.nextInt(); SeasonsOfYear.conformityOfMonth(numberMonth);
		 */
		//задача For 4
		
		 Scanner newPrice = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int priceKg = newPrice.nextInt();
		 CandyPrice.getPrice(priceKg);
	}
}
