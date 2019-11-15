package infopulse.beginnertask.fileview;

import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFile {
	public class FileView implements ShowAble{

		public FileView() {
			
		}

		@Override
		public void show(Object[] listUranium) {
			try {
				FileWriter fw = new FileWriter("log.txt",true);
				for (Object st : listUranium) {
					fw.write(st.toString()+"\n");			
				}
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public void show (Object uraw) {
			
			try {
				FileWriter fw = new FileWriter("log.txt",true);
				fw.write(uraw.toString()+"\n");				
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
