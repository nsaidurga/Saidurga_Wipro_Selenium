package Day8;

import java.util.Scanner;
import java.util.Stack;
/* Stack
•	Understand how to use the Stack class for LIFO (Last In, First Out) operations.
•	________________________________________
•	Create a Stack of integers and:
•	Push 5 elements.
•	Pop the top element.
•	Peek the current top.
•	Check if the stack is empty.
•	Reverse a string using Stack:
•	Input a string from the user.
•	Use a stack to reverse and print the string.
 */
public class ReverseStringStack {
	public static void reverse(String str) {
		Stack<Character> s=new Stack<>();
		for(char c:str.toCharArray()) {
			s.push(c);
		}
		System.out.println(s);
		System.out.println("Reversed String:");
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		//System.out.println(s.reversed());
	}
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(19);
		s.push(31);
		s.push(5);
		s.push(14);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		reverse(str);
		sc.close();
	}
}
/*output:
[10, 19, 31, 5, 14]
14
5
false
Enter a string:
Java
[J, a, v, a]
Reversed String:
a
v
a
J
*/