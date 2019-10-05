//05.10.2019 
package infopulse.beginnertask.classes;

import java.util.ArrayList;

public class ClassExampleShop {

	public static void main(String[] args) {
		Currency.USD = 30.00;
		Product apple = new Product("Golden", 0.2, 20, 1);
		Product potato = new Product("Red", 0.15, 10, 1);
		Product banana = new Product("Yellow", 0.3, 25, 1);

		double customerPrice = apple.getPrice();
		System.out.println(customerPrice);

		apple.print();
		potato.print();
		banana.print();
		
		ArrayList list;
		
		Product[] products = { apple, potato, banana, new Product("Bud", 0.5, 25, 2) };

		Orders.MaxPriceWithWeightGreater(products, 0.2);
			
	
/*		for (Product current : products) {
			if (maxPriceProduct.getPrice()<current.getPrice()){
				maxPriceProduct=current;
			}
		}*/
	}
}
