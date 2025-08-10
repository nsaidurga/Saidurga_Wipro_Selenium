/*
 5. Builder Pattern & Encapsulation: Immutable Product
Use Builder design to create immutable class with encapsulation.
a)	Create an immutable Product class with private final fields such as name, code, price, and optional category.
b)	Use a static nested Builder inside the Product class. Provide methods like withName(), withPrice(), etc., that apply validation (e.g. non-negative price).
c)	The outer class should have only getter methods, no setters.
d)	The builder returns a new Product instance only when all validations succeed.

 */
package Day5;

public final class Product {
	private final String name;
	private final String code;
	private final double price;
	private final String category;

	private Product(Builder builder) {
		super();
		this.name = builder.name;
		this.code = builder.code;
		this.price = builder.price;
		this.category = builder.category;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public static class Builder {
		private String name;
		private String code;
		private double price;
		private String category;

		public Builder withName(String name) {
			if (name == null || name.trim().isEmpty()) {
				throw new IllegalArgumentException("Product name cannot be empty.");
			}
			this.name = name;
			return this;
		}

		public Builder withCode(String code) {
			if (code == null || code.trim().isEmpty()) {
				throw new IllegalArgumentException("Product code cannot be empty.");
			}
			this.code = code;
			return this;
		}

		public Builder withPrice(double price) {
			if (price < 0) {
				throw new IllegalArgumentException("Price cannot be negative.");
			}
			this.price = price;
			return this;
		}

		public Builder withCategory(String category) {
			this.category = category;
			return this;
		}

		public Product build() {
			if (name == null || code == null || price < 0) {
				throw new IllegalStateException("Product fields are invalid or incomplete.");
			}
			return new Product(this);
		}
	}

	@Override
    public String toString() {
        return "Product: " + name + "\nCode: " + code + "\nPrice: $" + price +
                (category != null ? ("\nCategory: " + category) : "");
	}
	public static void main(String[] args) {
		 try {
	            Product p1 = new Product.Builder()
	                .withName("Laptop")
	                .withCode("LP100")
	                .withPrice(75000)
	                .withCategory("Electronics")
	                .build();

	            System.out.println(p1);

	            // Uncomment to test failure
	            // Product p2 = new Product.Builder().withPrice(-100).build();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}
}

/*
output: 

Product: Laptop
Code: LP100
Price: $75000.0
Category: Electronics


*/