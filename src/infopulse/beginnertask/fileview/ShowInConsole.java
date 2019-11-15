package infopulse.beginnertask.fileview;

public class ShowInConsole implements ShowAble{
	
	
	@Override
	public void show (Object[] groupObj) {
		for (Object uraw : groupObj) {
			System.out.println(uraw);
		}		
	}
	
	@Override
	public void show(Object uraw) {
			System.out.println(uraw);	
	}
}
