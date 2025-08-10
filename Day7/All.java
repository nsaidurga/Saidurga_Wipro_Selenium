/*
 Wrapper classes
1.	Check if character is a Digit
2.	Compare two Strings
3.	Convert using valueof method
4.	Create Boolean Wrapper usage
5.	Convert null to wrapper classes
 */
package Day7;
public class All {

	public static void main(String[] args) {
		char c1='5';
		if(Character.isDigit(c1)) {
			System.out.println(c1+" is digit");
		}
		//compare
		String s="A";
		String s1="D";
		System.out.println(s.compareTo(s1));
		
		//valueOf
		int a=10;
		String str=String.valueOf(a);
		System.out.println(str);
		
		String c="sai123";
		//int i=Integer.parseInt(c);
		System.out.println(c);
		
		
		String r=String.valueOf(true);
		String e=String.valueOf(3.14);
		System.out.println(r+"  "+e);
		
		//null to wrapper
		String val=null;
		Integer num=(val!=null) ? Integer.valueOf(val) : null;
		System.out.println(num);
		//Integer i=Integer.valueOf(null);
	}

}

/*
output:
5 is digit
-3
10
sai123
true  3.14
null
*/