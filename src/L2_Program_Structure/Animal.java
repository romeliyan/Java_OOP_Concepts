package L2_Program_Structure;

public class Animal {
	
	//attributes
	private int age;
	private String gender;
	private int weightInLbs;
	
	//constructor
	public Animal(int age, String gender, int weightInLbs) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	//methods
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}

}
