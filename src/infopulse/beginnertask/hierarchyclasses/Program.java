package infopulse.beginnertask.hierarchyclasses;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
	Vehicle car1 =  new Car("Chevrolet Equinox", 2.2190039235873638, 48.92580546168701,9900.00, 140,2017 );
	Vehicle car2 =  new Car("Tesla model X", 18.964712326482857, 47.69158020304256,81200.00, 250,2015 );
	Vehicle ship1 =  new Ship ("Harmony of the Seas",0.8715169168877646, 50.378094176069084,1350000.00, 46,2002, 6000, "Port Canaveral" );
	Vehicle ship2 =  new Ship ("Norwegian Epic", 4.117317528734559, 49.757537844205025,8500000.00, 41,2010, 4200, "Barcelona" );
	Vehicle ship3 =  new Ship ("Aegean Odyssey", 26.486030210617148, 58.46282038705229,2000000.00, 200,2017, 345, "Copenhagen" );
	Vehicle plane1 =  new Plane("Boeing 777", 12.862341015079148, 53.08495177018731,269500.00, 892,2016,396, 10000 );
	Vehicle plane2 =  new Plane("Airbus A380", 30.88368130323026, 38.36427191335559,489000.00, 1185,2015,525, 9000 );
	Vehicle plane3 =  new Plane("Embraer 190", 12.193919676146223, 55.09487293321987,2050000.00, 871,2017,114, 8500 );
	
	Vehicle [] transport = new Vehicle [10];
	transport[0] = car1;
	transport[1] = car2;
	transport[2] = ship1;
	transport[3] = ship2;
	transport[4] = ship3;
	transport[5] = plane1;
	transport[6] = plane2;
	transport[7] = plane3;
	transport[8] = new Batmobile("Batmobile", 18.964712326487657, 49.69153210304256, 100000.00, 500, 2019);
	transport[9] = new Amfibia ("Amfibia", 12.8715169166677646, 35.378093336069084, 255000.00,1340, 1989,
			5, "Odessa");
	
		// 1
		double max = transport[0].getPrice();
		String maxName = transport[0].getModelName();
		for (int i = 1; i < transport.length; i++) {
			if (transport[i].getPrice() > max) {
				max = transport[i].getPrice();
				maxName = transport[i].getModelName();
			}
		}
		System.out.println("1. Vehicle with the biggest price is " + maxName + ", whose value is " + max + " USD.");

		// 2
		double min = transport[0].getPrice();
		String minName = transport[0].getModelName();
		for (int i = 1; i < transport.length; i++) {
			if (min > (transport[i].getPrice())) {
				min = transport[i].getPrice();
				minName = transport[i].getModelName();
			}
		}
		System.out.println("\n2. Vehicle with the lowest price is " + minName + ", whose value is " + min + " USD.");
		
		// 3
		ArrayList<Vehicle> listFrom2000 = new ArrayList<Vehicle>();
		for (int i = 0; i < transport.length; i++) {
			if (transport[i].getYearOfManufacture() >= 2000 && transport[i].getPrice() <= 10000.00) {
				listFrom2000.add(transport[i]);
			}
		}
		System.out.println("\n4. List of vehicles, year of manufacture from 2000,price < 10 000.00 USD:\n");
		for (int i = 0; i < listFrom2000.size(); i++) {
			System.out.print(listFrom2000.get(i).getModelName() + "\n");

		}
		// 4
		ArrayList<Vehicle> listFrom2000To2010 = new ArrayList<Vehicle>();
		for (int i = 0; i < transport.length; i++) {
			if (transport[i].getYearOfManufacture() >= 2000 && transport[i].getYearOfManufacture() <= 2010) {
				listFrom2000To2010.add(transport[i]);
			}
		}
		System.out.println("\n4. List of vehicles, year of manufacture from 2000 to 2010:\n");
		for (int i = 0; i < listFrom2000To2010.size(); i++) {
			System.out.print(listFrom2000To2010.get(i).getModelName() + "\n");

		}

		// 5
		ArrayList<Vehicle> notOlderFiveYears = new ArrayList<Vehicle>();
		
		    
		    for (int i = 0; i < transport.length; i++) {
				if (transport[i].getYearOfManufacture() >= 2014 && transport[i].getYearOfManufacture() <= 2019) {
					notOlderFiveYears.add(transport[i]);
				}
			}
		    double averagePrice = 0;
		    double sum =0;
		    for (int j = 0; j < notOlderFiveYears.size(); j++) {
		         sum += transport[j].getPrice();
		    }
		    averagePrice = sum / notOlderFiveYears.size();
		    double minBorderPrice = averagePrice- (averagePrice*20)/100;
		    double maxBorderPrice = averagePrice+(averagePrice*20)/100;
		    
		    
		    System.out.println("\n5. List of vehicles, no older than five years, with speed range from 100 to 200 km/h and average price, which is "+new DecimalFormat("#0.00").format(averagePrice)+ " (+-20%):\n");
		    for (int i = 0; i < notOlderFiveYears.size(); i++) {
		    	if(notOlderFiveYears.get(i).getPrice()>=minBorderPrice && notOlderFiveYears.get(i).getPrice()<=maxBorderPrice && notOlderFiveYears.get(i).getSpeed()<=200 && notOlderFiveYears.get(i).getSpeed()>=100)
		    	{System.out.println(notOlderFiveYears.get(i).getModelName());}
		    	
		    }
		 // 6
			int countCar = 0;
			int countPlane = 0;
			ArrayList<Vehicle> listOfCars = new ArrayList<Vehicle>();
			for (Vehicle item : transport) {
				if (item.getClass().equals(Car.class)) {
					listOfCars.add(item);
					countCar++;
				}
				if (item.getClass().equals(Plane.class)) {
					countPlane++;
				}
			}
			System.out.println(
					"\n6.There are " + countCar + " cars in this list.\nThere are " + countPlane + " planes in this list.");
			//7
			double minCar = listOfCars.get(0).getPrice();
			String minNameCar =listOfCars.get(0).getModelName();
			for (int i = 1; i < listOfCars.size(); i++) {
				if (minCar >listOfCars.get(i).getPrice()) {
					minCar = listOfCars.get(0).getPrice();
					minNameCar = listOfCars.get(0).getModelName();
				}
			}
			System.out.println("\n7. Car with the lowest price is " + minNameCar + ", whose value is " + minCar + " USD.");
			
			//8
			ArrayList<Vehicle> ListOfShips = new ArrayList<Vehicle>();
			System.out.println("\n8. List of ships with year of manufacture from 2000 to 2010:\n");
			for (Vehicle item : transport) {
				if (item.getClass().equals(Ship.class)) {
					ListOfShips.add(item);
					if (item.getYearOfManufacture() >= 2000 && item.getYearOfManufacture() <= 2010) {
						System.out.println(item.getModelName());
					}
				}
			
		}
			System.out.println("\nList of *moveable* vehicles:\n");
			ArrayList<Vehicle> ListOfMoveable = new ArrayList<Vehicle>();
			for (Vehicle item : transport){
			if (item instanceof MoveAble){
				ListOfMoveable.add(item);
				System.out.println(item.getModelName());
			}
	} 
			System.out.println("\nList of *flyable* vehicles:\n");
			ArrayList<Vehicle> ListOfFlyable = new ArrayList<Vehicle>();
			for (Vehicle item : transport){
			if (item instanceof FlyAble){
				ListOfFlyable.add(item);
				System.out.println(item.getModelName());
			}
	} 
			System.out.println("\nList of *swimable* vehicles:\n");
			ArrayList<Vehicle> ListOfSwimable = new ArrayList<Vehicle>();
			for (Vehicle item : transport){
			if (item instanceof SwimAble){
				ListOfSwimable.add(item);
				System.out.println(item.getModelName());
			}
	} 
	}
}
