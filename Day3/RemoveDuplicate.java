package Day3;
//7. remove duplicate elements from an array 
public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,4,2,5,2,1,3,5};
		int temp[]=new int[arr.length];
		int k=0;
		
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			for(int j=0;j<k;j++) {
				if(arr[i]==temp[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[k++]=arr[i];
			}
		}
		System.out.println("After removing duplicates:");
		for(int i=0;i<k;i++) {
			System.out.print(temp[i]+" ");
		}
		
	}

}
/*
output:
After removing duplicates:
1 4 2 5 3 
*/