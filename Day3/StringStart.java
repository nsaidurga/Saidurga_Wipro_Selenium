package Day3;
//5.Check if String  starts with “j” and end 	with “a” . eg. “java” 
public class StringStart {

	public static void main(String[] args) {
		String s="java";
		
			if(s.startsWith("j") && s.endsWith("a")) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		
	}

}
/*
output:true
*/