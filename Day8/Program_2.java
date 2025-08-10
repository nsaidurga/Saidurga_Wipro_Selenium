package Day8;
/*
 2. Search an Element
Write a program to:
	Create an ArrayList of integers.
	Ask the user to enter a number.
	Check if the number exists in the list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println("Enter an element: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(a.contains(n)) {
			System.out.println(n+" is exists in list");
		}
		else {
			System.out.println(n+" is not exists in list");
		}
		sc.close();
	}

}
/*output:
Enter an element: 
34
34 is not exists in list
*/