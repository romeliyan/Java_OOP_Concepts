package L5_Interfaces_Part_2;

public class Zoo {

	public static void main(String [] args) {
		
		Animal animal1 = new Animal("M",5,10);
		animal1.eat();
		animal1.sleep();
		
		Bird bird1 = new Bird("M",5,10);
		bird1.eat();
		bird1.sleep();
	//	bird1.fly();
		
		
		Chicken chick1 = new Chicken("M",5,10);
		chick1.eat();
		chick1.sleep();
	//	chick1.fly();
		
		
		Parrot parrot1 = new Parrot("M",5,10);
		parrot1.eat();
		parrot1.sleep();
		parrot1.fly();
		parrot1.jump();
	}
	
}

//if you want to display chicken1 is not flying then you can implements flayable interface inside 
//chicken class and writing not flying inside the fly method's body
