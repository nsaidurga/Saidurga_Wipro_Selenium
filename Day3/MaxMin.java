package Day3;
//3. find maximum and minimum elements from an array. 
public class MaxMin {

	public static void main(String[] args) {
		int[] r= {54,23,3,34,12,43,55};
		int max=r[0];
		for(int i=0;i<r.length;i++) {
			if(r[i]>max) {
				max=r[i];
			}
		}
		System.out.println("Maximum number: "+max);
		
		int min=r[0];
		for(int i=0;i<r.length;i++) {
			if(r[i]<min) {
				min=r[i];
			}
		}
		System.out.println("Minimum number: "+min);
	}

}
/*
output:
Maximum number: 55
Minimum number: 3
	*/