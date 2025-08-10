package Day8;

import java.util.Stack;
/*Stack
•	Use Stack to check for balanced parentheses in an expression.
•	Input: (a+b) * (c-d)
•	Output: Valid or Invalid expression

 */
public class ParanthesisStack {
	
	public static boolean isBalanced(String exp) {
		Stack<Character> stack = new Stack<>();
		for(char c:exp.toCharArray()) {
			if(c=='('||c=='{'||c=='[') {
				stack.push(c);
			}
			else if(c==')'||c=='}'||c==']') {
				if(stack.isEmpty()) return false;
				char top=stack.pop();
				if(c==')'&&top!='(' || c==']'&&top!='[' || c=='}'&&top!='{')
					return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String s="(a+b) * (c-d)";
		boolean valid=isBalanced(s);
		System.out.println((valid ? "Valid" : "Invalid"));
	}

}
/*Output:
Enter a decimal number:
354637
[1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1]
*/