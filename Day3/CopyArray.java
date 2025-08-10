package Day3;
//8.copy all elements from one array to another. 
public class CopyArray {

	public static void main(String[] args) {
		int ar[]= {32,12,19,9};
		int t[]=new int[ar.length];
		int j=0; 
		for(int i=0;i<ar.length;i++) {
			t[j++]=ar[i];
		}

		for(int i=0;i<j;i++) {
			System.out.print(t[i]+" ");
		}
	}

}
/*
output:
32 12 19 9 
*/