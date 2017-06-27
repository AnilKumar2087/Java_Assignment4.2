package ADD;

package session4_assignment2;

/*
 * Inheritance is a compile-time mechanism. 
 * A super-class can have any number of subclasses. 
 * But a subclass can have only one superclass. 
 * This is because Java does not support multiple inheritance.
 * The superclass and subclass have “is-a” relationship between them.
 */

/* 
 * This class tests the concept of IS-A relation
 */

public class Test {

	public static void main(String[] args) {
		
		Car b1 = new Car();
		b1.colour = "Blue";
		b1.speed = 200;
		b1.size = 22;
		b1.CC= 1000;
		b1.gears = 5;
		
		b1.attributescar();
	}

}
