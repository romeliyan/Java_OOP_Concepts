package L3_Inheritance;

//child class of animal
public class Bird extends Animal{

	//when we are extend the default construct would not work
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		
	}
	
	public void fly() {
		System.out.println("Flying...");
	}


}
