package L1_Classes_and_Objects;

import java.util.Scanner;

public class Earth {
	
	public static void main(String args[]) {
		
		//get user inputs
		Scanner myScanner = new Scanner(System.in);
		
		//declare variables to store input data
		int age = 0;
		String name = null;
		String eyeColor = null;
		int height = 0;
		
		System.out.println("Enter name : ");
		name = myScanner.next();
		
		System.out.println("Enter age : ");
		age = myScanner.nextInt();
		
		System.out.println("Enter eye color : ");
		eyeColor = myScanner.next();
		
		System.out.println("Enter height : ");
		height = myScanner.nextInt();
		
		
		
		//variable type Human
		Human tom;
		
		//assign variable values/ inserting from inputed fields
		tom = new Human(name,age,height,eyeColor);
		
		//tom.age = 5;
		//tom.eyeColor = "brown";
		//tom.heightInInches = 72;
		//tom.name = "Tom Cruise";
		
		//invoke speak method on object tom
		tom.speak();
		
		tom.eat();
		
	}

}
