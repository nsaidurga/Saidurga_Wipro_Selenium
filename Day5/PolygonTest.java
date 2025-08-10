/*
 6. Default and Static Methods in Interfaces
a)	Declare interface Polygon with:
b)	double getArea()
c)	default method default double getPerimeter(int... sides) that computes sum of sides
d)	a static helper static String shapeInfo() returning a description string
e)	Implement classes Rectangle and Triangle, providing appropriate getArea().
f)	In Main, call getPerimeter(...) and Polygon.shapeInfo().
 */
package Day5;

interface Polygon {
	double getArea();

	default double getPerimeter(int... sides) {
		double perimeter = 0;
		for (int side : sides) {
			perimeter += side;
		}
		return perimeter;
	}

	static String shapeInfo() {
		return "Polygon: A shape with 3 or more straight sides.";
	}
}

class Rectangle1 implements Polygon {
	private int length, width;

	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

}

class Triangle implements Polygon {
	private int base, height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}

public class PolygonTest {

	public static void main(String[] args) {
		Polygon r = new Rectangle1(10, 5);
		Polygon t = new Triangle(6, 4);

		System.out.println("Rectangle Area: " + r.getArea());
		System.out.println("Rectangle Perimeter: " + r.getPerimeter(10, 5, 10, 5));

		System.out.println("Triangle Area: " + t.getArea());
		System.out.println("Triangle Perimeter: " + t.getPerimeter(6, 5, 4));
	}

}

/*
 output:
 Rectangle Area: 50.0
Rectangle Perimeter: 30.0
Triangle Area: 12.0
Triangle Perimeter: 15.0

*/