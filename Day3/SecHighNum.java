package Day3;
//4.write a program to find out second highest element from an array 
public class SecHighNum {

	public static void main(String[] args) {
		int[] a= {45,12,87,29,2,31,76,133,99,9,54};
		int high=Integer.MIN_VALUE;
		int secHigh=Integer.MIN_VALUE;
		
		for(int num:a) {
			if(num>high) {
				secHigh=high;
				high=num;
			}
			else if((num!=high)&& num>secHigh) {
				secHigh=num;
			}
		}
		System.out.println("Second highest: "+secHigh);
	}

}
/*
output:
Second highest: 99
*/