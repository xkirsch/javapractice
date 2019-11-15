package infopulse.beginnertask.fileview;


public class ListController {
	private UraniumRaw[] listUranium;
	private ShowAble view;
	public ListController(UraniumRaw[] listUranium) {
		this.listUranium = listUranium;
	}
	public ListController(UraniumRaw[] listUranium, ShowAble view) {
		this.listUranium = listUranium;
		this.view = view;
	}
	
		public void run() {
			for (UraniumRaw uraw : listUranium) {
		
			if(uraw!=null)
				view.show(uraw);
	
}
}}