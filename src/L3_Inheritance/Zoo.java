package L3_Inheritance;

public class Zoo {

public static void main(String [] args) {
		
		Animal animal1 = new Animal(12,"M", 23);
		animal1.eat();
		
		Bird bird1 = new Bird(9,"F", 14);
		bird1.eat();
		bird1.sleep();
		bird1.fly();
		
	}
}
