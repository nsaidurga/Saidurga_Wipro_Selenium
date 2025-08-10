package Day9;
/*
 Q2. Create a Product class and sort products by price using Comparable.
Implement Comparable<Product> and sort a list of products using Collections.sort().
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{
	int price;
	String pname;
	
	public Product(int price, String pname) {
		this.price = price;
		this.pname = pname;
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", pname=" + pname + "]";
	}
	/*
	public int compareTo(Product p) {
		return this.pname.compareTo(p.pname);
	}*/
	
	public int compareTo(Product o) {
		return price-o.price;
	}
	
	public static void main(String[] args) {
		
		List<Product> l=new ArrayList<>();
		l.add(new Product(15000,"mobile"));
		l.add(new Product(55000,"laptop"));
		l.add(new Product(650,"headphones"));
		Collections.sort(l);
		l.forEach(System.out::println);
	}

}
/*
output:
Product [price=650, pname=headphones]
Product [price=15000, pname=mobile]
Product [price=55000, pname=laptop]
*/