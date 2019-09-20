package infopulse.beginnertask.switches;

public class LengthConverter {
	public static void convertToMeters(int a, double l) {
		switch(a){
		case 1:  System.out.println("Length "+l+"dm ="+(l*10)+"m.");
			break;
		case 2: System.out.println("Length "+l+"km ="+(l*1000)+"m.");
			break;
		case 3: System.out.println("Length "+l+"m ="+l+"m.");
			break;
		case 4:System.out.println("Length "+l+"mm ="+(l/1000)+"m.");
			break;
		case 5:System.out.println("Length "+l+"cm ="+(l/100)+"m.");
			break;
	
		default: System.out.println("An error has occured.");
		
		
	}
	}
}
