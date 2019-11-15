package infopulse.beginnertask.fileview;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShowInForm implements ShowAble {
	 JFrame form;
	    JPanel panel;
		public ShowInForm() {
			form = new JFrame();
			form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			form.setTitle("Extraction and processing of uranium raw materials");
			form.setSize(1000, 500);
			panel = new JPanel();
			form.setContentPane(panel);
		
		}
	@Override
	public void show(Object[] listUranium) {
		for (Object uraw : listUranium) {
			show(uraw);}

	}

	@Override
	public void show(Object uraw) {
	
		JTextField text = new JTextField(uraw.toString());
		panel.add(text);
		form.setVisible(true);
	}

}
