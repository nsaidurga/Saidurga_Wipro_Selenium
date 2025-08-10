package Day6;
/*
 2.	Convert an int to String using String.valueOf(...), 
 then back with Integer.parseInt(...). Handle NumberFormatException.
 */
public class Program2 {

	public static void main(String[] args) throws NumberFormatException{
		int i=198;
		String s=String.valueOf(i);
		
		int n=Integer.parseInt(s);
		
		System.out.println(s);
		System.out.println(n);
	}

}
/*output:
198
198
*/