package infopulse.beginnertask.classes;

public class OrderDyn {

	public static void main(String[] args) {
	Order order = new Order();
order.add(new Product ("Apple Golden", 0.2, 20, 1));
order.add(new Product ("Tomato", 0.3, 25, 1));
order.add(new Product ("Plum", 0.1, 10, 1));
order.add(new Product ("Raspberry", 0.05, 5, 1));

Product p = order.MaxPriceWithWeightGreater(0.15);
if (p!=null)p.print();
else System.out.println("NO");
	}

}
