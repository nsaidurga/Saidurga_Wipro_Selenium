package Day6;
/*
 Compound Assignment Behaviour 
1.	Initialize int x = 5;.
2.	Write two operations:
x = x + 4.5;    // Does this compile? Why or why not?
x += 4.5;       // What happens here?
3.	Print results and explain behavior in comments (implicit narrowing, compile error vs. successful assignment).

 */
public class Program3 {

	public static void main(String[] args) {
		int x = 5;
		// x=x+4.5; compile time error

		x += 4.5;

		System.out.println(x);
	}

}
//Because x is int,but x+4.5 is double , 
// cant assign directly double to int without explicit cast
//+= includes an implicit narrowing conversion. Java automatically
// casts the result (4.5) to int (4) by truncating the decimal part.
/*
output:
9
*/