package L4_Interfaces;

public class Bird extends Animal{
	

	public Bird(String gender, int age, int weight) {
		super(gender, age, weight);
	}

	public void fly() {
		System.out.println("flying...");
	}

}
