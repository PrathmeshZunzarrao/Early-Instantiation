package relationship;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1 = new Car("TATA", "White", 800000.00, "Sedan");
		
		c1.displayCar();
		
		c1.eng.displayEngine(); 

	}

}
