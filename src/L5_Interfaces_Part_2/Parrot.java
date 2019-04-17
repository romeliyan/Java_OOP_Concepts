package L5_Interfaces_Part_2;

public class Parrot extends Bird implements Flyable,Jumpable{

	public Parrot(String gender, int age, int weight) {
		super(gender, age, weight);
	}

	@Override
	public void fly() {
		System.out.println("flying...");
	}

	@Override
	public void jump() {
		System.out.println("jumping...");
		
	}

}
