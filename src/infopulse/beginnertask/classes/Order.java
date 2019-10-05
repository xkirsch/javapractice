package infopulse.beginnertask.classes;

public class Order {
	private Product[] products;
	private int size; 
	public Order(){
		products = new Product [10];
		size =-1; 
	}
	public void add (Product product){
		if (size<products.length-1)
		products[++size]= product;
	}
	public Product MaxPriceWithWeightGreater (double weight){
		Product maxPriceProduct = products[0];
		boolean isFind = false;
		for (int i = 0; i <size; i++) {
			if (maxPriceProduct.getPrice()<products[i].getPrice()&& products[i].getWeight()>weight){
				maxPriceProduct=products[i];
				isFind = true;
			}
		}
		if (isFind)
		return maxPriceProduct;
		else return null;
	}
}
