import java.util.Scanner;

import infopulse.beginnertask.begin.*;
import infopulse.beginnertask.bool.OddNumber;
import infopulse.beginnertask.cyclesfor.CandyPrice;
import infopulse.beginnertask.integer.*;
import infopulse.beginnertask.switches.*;



public class CoreClass { 
	public static void main(String[] args) {
	// ������ ������� ����� ������ ������ - NTEGER, BEGIN, BOOL
		/*
		 * double cubeEdge = 6.0; // Put this value in cm. double circleLength = 40.0;
		 * CubeCalculator calc = new CubeCalculator(); CircleCalculator circle = new
		 * CircleCalculator(); double v = calc.findVolume(cubeEdge); double s =
		 * calc.findSurface(cubeEdge); double r = circle.findRadius(circleLength);
		 * double surf = circle.findSurface(circleLength);
		 * System.out.println("������ BEGIN 5");
		 * System.out.println("����� ���� ����� "+v);
		 * System.out.println("������� ���� ����� "+s);
		 * System.out.println("������ BEGIN 14");
		 * System.out.println("������ ����� ����� "+r);
		 * System.out.println("������� ����� ����� "+surf); int fullSeconds = 3459;
		 * secondsToMinutes sec = new secondsToMinutes(); int m =
		 * sec.findMinutes(fullSeconds); System.out.println("������ INTEGER 19");
		 * System.out.print("� ������ ����� ������ "+fullSeconds+" ������.");
		 * System.out.println("������ ������ "+m+" �����."); OddNumber odd = new
		 * OddNumber(); System.out.println("������ BOOLEAN 8\n"+odd.isOddNumber(5,9));
		 * int dayOfYear = 7;
		 * System.out.println("������ INTEGER 26\n"+DayOfTheWeekFinder.DayOftheWeek(
		 * dayOfYear));
		 */
		// ������ Case 15
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
		//������ Case 6
		/*
		 * Scanner newConverter =new Scanner(System.in);
		 * System.out.println("Enter the number from 1 to 5"); int valueToConvert =
		 * newConverter.nextInt(); System.out.println("Enter the number"); double
		 * lengthInMeters = newConverter.nextDouble();
		 * LengthConverter.convertToMeters(valueToConvert, lengthInMeters);
		 */
		//������ Case 3
				
		/*
		 * Scanner newMonth = new Scanner(System.in);
		 * System.out.println("Enter the number from 1 to 12"); int numberMonth =
		 * newMonth.nextInt(); SeasonsOfYear.conformityOfMonth(numberMonth);
		 */
		//������ For 4
		
		 Scanner newPrice = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int priceKg = newPrice.nextInt();
		 CandyPrice.getPrice(priceKg);
	}
}
