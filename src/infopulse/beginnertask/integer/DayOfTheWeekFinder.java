package infopulse.beginnertask.integer;

public class DayOfTheWeekFinder {
	public static String DayOftheWeek (int a) {
		int firstDayOfTheYear = 2;
		int currentDay = (a%7) + firstDayOfTheYear-1;
		String b = "Ошибка";
		switch(currentDay) {
		case 0:  b="Воскресенье";
		break;
		case 1:  b="Понедельник";
		break;
		case 2:  b="Вторник";
		break;
		case 3:  b="Среда";
		break;
		case 4:  b="Четверг";
		break;
		case 5:  b="Пятница";
		break;
		case 6:  b="Суббота";
		break;
		default: break;
		}
		return b+", "+currentDay;
	}
}
