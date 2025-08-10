/*
 2: Throw and Handle Custom Exception
Create a class OddChecker:
1.	Implement a static method:
public static void checkOdd(int n) throws OddNumberException {  ...  }
2.	If n is odd, throw a custom checked exception OddNumberException with message "Odd number: " + n.
3.	In main:
o	Call checkOdd with different values (including odd and even).
o	Handle exceptions with try catch, printing e.getMessage() when caught.
Define the exception like:
public class OddNumberException extends Exception {
    public OddNumberException(String message) { super(message); }
}
 */
package Day6;
class OddNumberException extends Exception{
	public OddNumberException(String message) {
		super(message);
	}
}
public class OddChecker {
	public static void checkOdd(int n) throws OddNumberException{
		if(n%2!=0) {
			throw new OddNumberException("Odd number:"+n);
		}
	}
	public static void main(String[] args) {
		try {
			checkOdd(20);
			checkOdd(13);
		} catch (OddNumberException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Execution completed");
		}
	}

}

/*
output:
Odd number:13
Execution completed
*/