package Day3;
//9.Sort an array in ascending order 
public class SortArray {

	public static void main(String[] args) {
		int arr[]= {13,9,21,1,25,19,3};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		
		System.out.println("Ascending order of elements:");
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
/*
output:
Ascending order of elements:
1 3 9 13 19 21 
*/