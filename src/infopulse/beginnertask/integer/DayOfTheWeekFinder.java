package infopulse.beginnertask.integer;

public class DayOfTheWeekFinder {
	public static String DayOftheWeek (int a) {
		int firstDayOfTheYear = 2;
		int currentDay = (a%7) + firstDayOfTheYear-1;
		String b = "������";
		switch(currentDay) {
		case 0:  b="�����������";
		break;
		case 1:  b="�����������";
		break;
		case 2:  b="�������";
		break;
		case 3:  b="�����";
		break;
		case 4:  b="�������";
		break;
		case 5:  b="�������";
		break;
		case 6:  b="�������";
		break;
		default: break;
		}
		return b+", "+currentDay;
	}
}
