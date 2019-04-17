package L3_Inheritance;

public class Fish extends Animal {

	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		
	}
	
	public void swim() {
		System.out.println("Swimming...");
	}

}
