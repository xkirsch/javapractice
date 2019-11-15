package infopulse.beginnertask.fileview;

public class Main {

	public static void main(String[] args) {
		
		ListUraniumRecycling groupFromFile = new ListUraniumRecycling("d:\\uran.csv");
		UraniumRaw [] listUranium = groupFromFile.getList();
		System.out.println("Extraction and processing of uranium raw materials " + listUranium[10]);
		
		ListController formListUranium = new ListController(listUranium,new ShowInForm());
		formListUranium.run();

	}

}
