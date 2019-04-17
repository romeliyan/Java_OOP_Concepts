package L4_Interfaces;

public class Chicken extends Bird {

	public Chicken(String gender, int age, int weight) {
		super(gender, age, weight);
	}
	
	//overriding the method defined in Bird
	public void fly() {
		System.out.println("not flying");
	}

}
