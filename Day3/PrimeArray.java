package Day3;
//10.print only prime numbers from array 
public class PrimeArray {
	static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8,11,12,17,983};
		
		for(int n:a) {
			if(isPrime(n)) {
				System.out.print(n+" ");
			}
		}
	}

}
/*
output:
2 3 5 7 11 17 983 
*/