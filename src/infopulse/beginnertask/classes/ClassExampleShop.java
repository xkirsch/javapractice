//05.10.2019 
package infopulse.beginnertask.classes;

public class ClassExampleShop {

	public static void main(String[] args) {
		Currency.USD = 30.00;
		Product apple = new Product ("Golden",0.2,20,1);
		Product potato = new Product ("Red",0.15,10,1);
		Product banana = new Product ("Yellow",0.3,25,1);
		
		double customerPrice = apple.getPrice();
		System.out.println(customerPrice);
			
	
		apple.print();
		potato.print();
		banana.print();
	Product[] products = new Product[4];
	products[0] =apple;
	products[1] =potato;
	products[2] =banana;
	products[3] =new Product("Bud",0.5,25,2);
	
	for (int i = 0; i < products.length; i++) {
		products[i].print();
	}
}
}
