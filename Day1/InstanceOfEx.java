/*6. What is the use of the `instanceof` keyword in Java?

The instanceof keyword is used to check whether an object is an instance of a specific class or subclass.
It returns true if the object is of the specified type.
*/

package Day1;
class Animal {}
class Dog extends Animal {}

public class InstanceOfEx {

	public static void main(String[] args) {
		Animal a = new Dog();
        System.out.println(a instanceof Dog); 
        System.out.println(a instanceof Animal);
	}

}

/*
output:
true
true
*/