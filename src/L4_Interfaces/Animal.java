package L4_Interfaces;

public class Animal {
	
	private String gender;
	private int age;
	private int weight;
	
	
	public Animal(String gender,int age,int weight) {
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	
	public void sleep() {
		System.out.println("sleeping...");
	}
	
	public void eat() {
		System.out.println("eating...");
	}

}
