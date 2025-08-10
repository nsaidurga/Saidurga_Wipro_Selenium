package Day3;
//13. merge two arrays and sort them 
import java.util.Arrays;

public class MergeTwo {

	public static void main(String[] args) {
		int a1[]= {5,3,1,2,4};
		int[] a2= {9,11,6,8,7};
		
		int temp[]=new int[a1.length+a2.length];
		int k=0;
		for(int i=0;i<a1.length;i++) {
			temp[k++]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			temp[k++]=a2[i];
		}
		Arrays.sort(temp);
		System.out.println("Merged Array: "+Arrays.toString(temp));
	}

}
/*
output:
Merged Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11]
*/