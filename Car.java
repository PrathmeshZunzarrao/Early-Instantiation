package relationship;

public class Car {

	String brand;
	String colour;
	Double price;
	String type;
	Engine eng = new Engine(150, 1200, 100, 2, 2); // Early Instantiation
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String brand,String colour,Double price,String type)
	{
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.type = type;
	}
	
	public void displayCar()
	{
		System.out.println("Company Name : " + brand);
		System.out.println("Car Colour : " + colour);
		System.out.println("Price of Car : " + price);
		System.out.println("Model : " + type);
		
		System.out.println("==============================");
		
	}
	
	
}
