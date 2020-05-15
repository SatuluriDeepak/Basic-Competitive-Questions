import java.util.Arrays;

public class MaximumSum {
	public static void main(String...args) {
		int a[] = { 1, 2, -4, -2, 3}; 
        int n = a.length; 
        maxSubArraySum(a, n); 
	}

	private static void maxSubArraySum(int[] a, int n) {
		Arrays.sort(a);
		long sum=0;
		if(a[n-1]>=0) {
			for(int i=0;i<a.length;i++) {
				if(a[i]>=0) {
					sum=sum+a[i];
					n--;
				}
			}
			int i=a.length-n;
			System.out.println(sum+" "+i);
		}
		else {
			System.out.println(a[n-1]+" 1");
		}	
	}

}
