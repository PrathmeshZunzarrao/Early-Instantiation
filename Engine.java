package relationship;

public class Engine {

	double hp;
	int cc;
	double weight;
	int cylinder;
	int stroke;
	
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(double hp,int cc,double weight,int cylinder,int stroke)
	{
		this.hp = hp;
		this.cc = cc;
		this.weight = weight;
		this.cylinder = cylinder;
		this.stroke = stroke;
	}
	
	
	public void displayEngine()
	{
		System.out.println("Power : " + hp);
		System.out.println("CC : " + cc);
		System.out.println("Weight : " + weight);
		System.out.println("No. of cylinders : " + cylinder);
		System.out.println("No. of Strokes : " + stroke);
		
		System.out.println("====================================");
	}
	
	
}
