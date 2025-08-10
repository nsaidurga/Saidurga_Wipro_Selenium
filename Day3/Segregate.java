package Day3;
//15 segregate even and odd numbers  
public class Segregate {

	public static void main(String[] args) {
		int a[]= {13,2,7,21,12,19,4,18};
		System.out.println("Even numbers: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		
		System.out.println("Odd numbers: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
/*
output:
Even numbers: 
2 12 4 18 
Odd numbers: 
13 7 21 19 
*/