package Day3;
//12. Rotate array elements(left or right) 
import java.util.Arrays;

public class RotateArray {
	static void rotateRight(int[] arr,int d) {
		int n=arr.length;
		d=d%n;
		int[] temp=new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=arr[(i+d)%n];
		}
		System.out.println("Right rotated array: "+Arrays.toString(temp));
	}
	static void rotateLeft(int[] arr,int d) {
		int n=arr.length;
		d=d%n;
		int[] temp=new int[n];
		for(int i=0;i<n;i++) {
			temp[(i+d)%n]=arr[i];
		}
		System.out.println("Left rotated array: "+Arrays.toString(temp));
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println("Original array: "+Arrays.toString(arr));
		rotateLeft(arr,2);
		rotateRight(arr,2);
	}

}
/*
output:
Original array: [10, 20, 30, 40, 50]
Left rotated array: [40, 50, 10, 20, 30]
Right rotated array: [30, 40, 50, 10, 20]
*/