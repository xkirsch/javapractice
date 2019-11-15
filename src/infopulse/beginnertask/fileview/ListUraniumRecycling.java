package infopulse.beginnertask.fileview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListUraniumRecycling {
	private UraniumRaw [] listUranium;
	public UraniumRaw[] getList() {
		return listUranium;
	}
	public ListUraniumRecycling(String fileName) {
		listUranium = new UraniumRaw[10];
		int count=0;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String str;
			while(true) {
				str = br.readLine();
				if(str == null) break;
				String[] words = str.split(";");
				int year= Integer.parseInt(words[0]);
				int month = Integer.parseInt(words[1]);
				int code = Integer.parseInt(words[2]);
				double amount = Double.valueOf(words[3]);
				String activity = words[4];
				UraniumRaw uraw = new UraniumRaw (year, month, code, amount, activity);
				
				if(count >= listUranium.length) {
					UraniumRaw [] temp = new UraniumRaw [listUranium.length*2];
					for (int i = 0; i < listUranium.length; i++) {
						temp[i]=listUranium[i];
					}
				
					listUranium = temp;
				}
		 	listUranium[count]= uraw;
				count++;
		
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}