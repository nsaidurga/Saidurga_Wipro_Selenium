package Day9;
/*
Q4. Sort a list of Book objects by bookId in descending order using Comparable.
Hint: Override compareTo() to return the reverse order.

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
	int bid;
	String bname;

	public Book(int bid, String bname) {
		// super();
		this.bid = bid;
		this.bname = bname;
	}
	

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}


	@Override
	public int compareTo(Book o) {
		return Integer.compare(o.bid, this.bid);
	}

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
        books.add(new Book(103, "Java Basics"));
        books.add(new Book(101, "Python Fundamentals"));
        books.add(new Book(105, "Data Structures"));
        
        Collections.sort(books);
        books.forEach(System.out::println);
	}
}
/*
output:
bid=105, bname=Data Structures]
bid=103, bname=Java Basics]
bid=101, bname=Python Fundamentals]
*/