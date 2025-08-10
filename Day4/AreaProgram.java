/*
 2.	Create a base class Shape with a method area() that prints a message.    
   Then create two subclasses                            
   Circle->override area() to calculator and print area of circle            
   Rectangle-> override area() to calculate and print area of a rectangle
 */
package Day4;
class Shape{
	void area() {
		System.out.println("Area of the Shape: ");
	}
}
class Circle extends Shape{
	int r;
	Circle(int r){
		this.r=r;
	}
	void area() {
		double result=(22/7)*r*r;
		System.out.println("Area of Circle: "+result);
	}
}
class Rectangle extends Shape{
	float l, b;
	Rectangle(float l,float b){
		this.l=l;
		this.b=b;
	}
	void area() {
		double result=l*b;
		System.out.println("Area of Circle: "+result);
	}
}
public class AreaProgram {

	public static void main(String[] args) {
		Shape s=new Shape();
		Circle c=new Circle(4);
		Rectangle r=new Rectangle(7.0f,3.0f);
		s.area();
		c.area();
		r.area();

	}

}
/*
output:
Area of the Shape: 
Area of Circle: 48.0
Area of Circle: 21.0
*/