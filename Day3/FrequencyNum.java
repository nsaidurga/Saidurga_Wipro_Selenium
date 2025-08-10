package Day3;
//11. find out frequency of each element 
public class FrequencyNum {

	public static void main(String[] args) {
		int[] a= {2,4,6,7,4,2,2,8,7};
		int n=a.length;
		boolean[] visited=new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(visited[i]) continue;
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(" "+a[i]+"->"+count);
		}
		
	}

}
/*
output:
 2->3
 4->2
 6->1
 7->2
 8->1
*/