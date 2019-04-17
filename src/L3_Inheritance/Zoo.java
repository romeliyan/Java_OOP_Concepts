package L3_Inheritance;

public class Zoo {

public static void main(String [] args) {
	
		System.out.println("*****Animal*****");
		Animal animal1 = new Animal(12,"M", 23);
		animal1.eat();
		animal1.sleep();
		
		System.out.println("*****Bird*****");
		Bird bird1 = new Bird(9,"F", 14);
		bird1.eat();
		bird1.sleep();
		bird1.fly();
		
		System.out.println("*****Fish*****");
		Fish fish1 = new Fish(2,"M",5);
		fish1.eat();
		fish1.sleep();
		fish1.swim();
		
	}
}
