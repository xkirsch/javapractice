package infopulse.beginnertask.classes;

public class Orders {
public static Product MaxPriceWithWeightGreater (Product [] products, double weight){
	Product maxPriceProduct = products[0];
	boolean isFind = false;
	for (int i = 0; i < products.length; i++) {
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
