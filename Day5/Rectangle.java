/*
 2. Rectangle Enforced Positive Dimensions
Encapsulate validation and provide derived calculations.
•	Build a Rectangle class with private width and height.
•	Constructor and setters should reject or correct non-positive values (e.g., use default or throw an exception).
•	Provide getArea() and getPerimeter() methods.
•	Include displayDetails() method.

 */
package Day5;

public class Rectangle {
	private int width;
	private int height;

	Rectangle(int width, int height) {
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
		} else {
			this.width = 0;
			this.height = 0;
		}
	}

	private void getArea() {
		int area = width * height;
	}

	private void getPerimeter() {
		int perimeter = 2 * (width + height);
	}

	private void displayDetails(int area, int perimeter) {

		System.out.println("Area of rectangle: " + area);
		System.out.println("Area of rectangle: " + perimeter);
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3, 8);
		r.displayDetails(9, 17);
	}

}

/*
 output:

Area of rectangle: 9
Area of rectangle: 17
*/