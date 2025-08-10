/*
 4: Multi Exception in One Try Block
Write a class MultiExceptionDemo:
	In a single try block, perform:
a)	Opening a file
b)	Parsing its first line as integer
c)	Dividing 100 by that integer
	Use multiple catch blocks in this order:
1.	FileNotFoundException
2.	IOException
3.	NumberFormatException
4.	ArithmeticException
	In each catch, print a tailored message:
a)	File not found
b)	Problem reading file
c)	Invalid number format
d)	Division by zero
	Finally, print "Execution completed".

 */
package Day6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiExceptionDemo {

	public static void main(String[] args) {
		BufferedReader reader=null;
		try {
			File f=new File("input.txt");
			reader=new BufferedReader(new FileReader(f));
			
			String line=reader.readLine();
			int number=Integer.parseInt(line);
			
			int result=100/number;
			
			System.out.println("Result: "+result);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("Problem reading file");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid number format");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		finally {
			System.out.println("Execution completed");
			try {
				if(reader!=null)reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
/*
output:
File not found
Execution completed
*/