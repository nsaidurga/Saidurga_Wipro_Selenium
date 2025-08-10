package Day3;
//6. write a program to print an array in reverse order 
public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Array Reverse order:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
/*
output:
Array Reverse order:
5
4
3
2
1
*/