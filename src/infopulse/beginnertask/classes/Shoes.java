package infopulse.beginnertask.classes;

public class Shoes {
	double size;
	int heelheight;
	String modelname;
	double price;	
	
	Shoes(String modelname, double size, double price, int heelheight){
		this.size= size;
		this.modelname=modelname;
		this.heelheight= heelheight;
		this.price= price;
	}
	public void print() {		
		System.out.println("Model= "+this.modelname+ "\n" + "Size= "+this.size+ "\n" + "Price= "+this.price + " EUR"+ "\n" + "Heel height= "+this.heelheight+" cm"+  "\n");
}
}