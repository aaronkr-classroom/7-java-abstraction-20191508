package chp9;
public class ex902 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Car myCar = new Car();
		
		myBike.printType();
		myBike.printBrand();
		myBike.printPrice();
		
		System.out.println("-----------------");
		
		myCar.printType();
		myCar.printBrand();
		myCar.printPrice();
		
	}

}
