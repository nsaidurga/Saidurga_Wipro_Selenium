/*
 3: Shape Area Calculator
Define enum Shape (CIRCLE, SQUARE, RECTANGLE, TRIANGLE) where each constant:
a)	Overrides a method double area(double... params) to compute its area.
b)	E.g., CIRCLE expects radius, TRIANGLE expects base and height.
Loop over all constants with sample inputs and print results.

 */
package Day6;
public class ShapeAreaCalculator {
	enum Shape {
		CIRCLE {
			double area(double...params) {
				double radius = params[0];
				return 3.14 * radius * radius;
			}
		},
		SQUARE {
			double area(double...params) {
				double side = params[0];
				return side * side;
			}
		},
		RECTANGLE {
			double area(double...params) {
				double length = params[0];
				double breadth = params[1];
				return length * breadth;
			}
		},
		TRIANGLE {
			double area(double...params) {
				double base = params[0];
				double height = params[1];
				return 0.5 * base * height;
			}
		};

		abstract double area(double... params);

	}

	public static void main(String[] args) {
		double radius = 3.0;
		double side = 4.0;
		double length = 5.0, width = 2.0;
		double base = 6.0, height = 3.0;

		for (Shape s : Shape.values()) {
			double result;

			switch (s) {
			case CIRCLE:
				result = s.area(radius);
				System.out.printf("Area of %s=%.2f\n", s ,result);
				break;
			case SQUARE:
				result = s.area(side);
				System.out.printf("Area of %s=%.2f\n", s ,result);
				break;
			case RECTANGLE:
				result = s.area(length, width);
				System.out.printf("Area of %s=%.2f\n", s ,result);
				break;
			case TRIANGLE:
				result = s.area(base, height);
				System.out.printf("Area of %s=%.2f\n", s ,result);
				break;
			}
		}
	}

}
/*
output:
Area of CIRCLE=28.26
Area of SQUARE=16.00
Area of RECTANGLE=10.00
Area of TRIANGLE=9.00
*/