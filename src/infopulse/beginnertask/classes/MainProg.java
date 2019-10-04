package infopulse.beginnertask.classes;

public class MainProg {

	public static void main(String[] args) {
		Dress dress1 = new Dress("Halter Dress", 38, 22.95, "100% elastane");
		dress1.print();
		dress1.reduce(15);

		Shoes shoes1 = new Shoes("Sandals", 36.5, 45.00, 10);
		shoes1.print();

	}

}
