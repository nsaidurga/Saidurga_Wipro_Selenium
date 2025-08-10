/*
 Object Casting with Inheritance 
1.	Define an Animal class with a method makeSound().
2.	Define subclass Dog:
a)	Override makeSound() (e.g. "Woof!").
b)	Add method fetch().
3.	In main:
Dog d = new Dog();
Animal a = d;          // upcasting
a.makeSound();
 */
package Day6;
class Animal{
	void makeSound() {
		System.out.println("Animal can make different sound");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Woof!");
	}
	void fetch() {
		System.out.println("fetched through teeth!");
	}
}
public class AnimalEx {

	public static void main(String[] args) {
		Dog d=new Dog();
		Animal a=d;
		a.makeSound();
	}

}

//output:Woof!