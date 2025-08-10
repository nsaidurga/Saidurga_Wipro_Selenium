//5.write a program to search for a number entered by the user in an array 
package Day3;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int[] d= {4,12,56,21,34,11,23,9};
		System.out.println("Enter a number from array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean found=false;
		for(int i=0;i<d.length;i++) {
			if(n==d[i]) {
				System.out.println("Your entered number at position: "+i);
				found=true;
				break;
			}			
		}
		if(!found) {
			System.out.println("Your entered number is not here");
		}
	}

}
/*
output:
Enter a number from array: 
21
Your entered number at position: 3
*/