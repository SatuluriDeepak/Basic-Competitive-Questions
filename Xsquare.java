import java.util.Arrays;
import java.util.Scanner;

public class Xsquare {
	public static void main(String...args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter List Length : ");
		int n=sc.nextInt();
		//System.out.println("Enter Qureries Length : ");
		int q=sc.nextInt();
		
		long a[]=new long[n];
		long b[]=new long[n];
		
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		
		
		for(int j=0;j<n;j++) 
			b[j]=sc.nextInt();
		
		long q1[]=new long[n];
		long q2[]=new long[n];
		q1[0]=a[0];
		q2[0]=b[0];
		
		
		for(int i=1;i<n;i++)
		{
			if(i%2==0) {
				q1[i]=q1[i-1]+a[i];
				q2[i]=q2[i-1]+b[i];
			}
			else 
			{
				q1[i]=q1[i-1]+b[i];
				q2[i]=q2[i-1]+a[i];
			}
			
		}
		//System.out.println(Arrays.toString(q1));
		//System.out.println(Arrays.toString(q2));
		
		
		for(int j=0;j<q;j++) {
			int sel=sc.nextInt();
			int start=sc.nextInt()-1;
			int end=sc.nextInt()-1;
			
			if((sel==1&& start%2==0 ) || (sel==2 && start%2==1)) {
				if(start - 1 < 0)
				{
					System.out.println(q1[end]);
				}
				else
				{
					System.out.println(q1[end] - q1[start - 1]);
				}
			}
			else
			{
				if(start - 1 < 0)
				{
					System.out.println(q2[end]);
				}
				else
				{
					System.out.println(q2[end] - q2[start - 1]);
				}
			}
			
		}
			
	}

}
