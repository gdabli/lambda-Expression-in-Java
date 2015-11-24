package HW1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
	
		//Array list for creating cars
		ArrayList<Car> preowncars = new ArrayList<Car>();
		preowncars.add(new Car(4899, 1993, 30));
		preowncars.add(new Car(3000, 1991, 28));
		preowncars.add(new Car(15000, 2015, 35));
		
		//lambda expressions for compare
		Comparator<Car> pricecompare= (Car c1, Car c2)->(c1.getPrice()-c2.getPrice());
		Comparator<Car> mileagecompare= (Car c1, Car c2)->(c1.getMileage()-c2.getMileage());
		Comparator<Car> yearcompare= (Car c1, Car c2)->(c1.getYear()-c2.getYear());
		
		//sorting cars based on the paramaeters
		Collections.sort(preowncars, pricecompare);
		Collections.sort(preowncars, mileagecompare);
		Collections.sort(preowncars, yearcompare);
		
		System.out.println("*************CARS COMPARISION************");
		System.out.println();
		System.out.println("***********PRISE COMPARISION************");
		for (Car car: preowncars){
			System.out.println(car.getPrice());
		}
		System.out.println();
		
		System.out.println("***********MILEAGE COMPARISION************");
		for(Car car: preowncars){
			System.out.println(car.getMileage());
		}
		
		System.out.println("***********YEAR COMPARISION************");
		for(Car car: preowncars){
			System.out.println(car.getYear());
		}
		
		
	}

}
