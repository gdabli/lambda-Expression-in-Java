package HW1;

public class Car {
	
	
	int price, year, mileage;
	
	Car(){
	}
	
	public Car(int price, int year, int mileage){
		this.price=price;
		this.year=year;
		this.mileage=mileage;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMileage(){
		return mileage;
	}
  
}
