import infopulse.beginnertask.begin.*;
import infopulse.beginnertask.bool.OddNumber;
import infopulse.beginnertask.integer.*;



public class CoreClass { 
	public static void main(String[] args) {
		double cubeEdge = 6.0; // Put this value in cm.
		double circleLength = 40.0; 
		CubeCalculator calc = new CubeCalculator();
		CircleCalculator circle = new CircleCalculator();
		double v = calc.findVolume(cubeEdge);
		double s = calc.findSurface(cubeEdge);
		double r = circle.findRadius(circleLength);
		double surf = circle.findSurface(circleLength);
		System.out.println("������ BEGIN 5");
		System.out.println("����� ���� ����� "+v);
		System.out.println("������� ���� ����� "+s);
		System.out.println("������ BEGIN 14");
		System.out.println("������ ����� ����� "+r);
		System.out.println("������� ����� ����� "+surf);
		int fullSeconds = 3459;
		secondsToMinutes sec = new secondsToMinutes();
		int m = sec.findMinutes(fullSeconds);
		System.out.println("������ INTEGER 19");
		System.out.print("� ������ ����� ������ "+fullSeconds+" ������.");
		System.out.println("������ ������ "+m+" �����.");
		OddNumber odd = new OddNumber();
		System.out.println("������ BOOLEAN 8\n"+odd.isOddNumber(5,9));
		int dayOfYear = 7;
		System.out.println("������ INTEGER 26\n"+DayOfTheWeekFinder.DayOftheWeek(dayOfYear));
	}

}
