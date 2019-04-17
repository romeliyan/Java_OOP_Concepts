package L3_Inheritance;

//parent class
public class Animal {
	
	//attributes
	String gender;
	int age; 
	int weightInLbs;
	
	
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
