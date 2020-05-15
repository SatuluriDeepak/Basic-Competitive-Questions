import java.util.Scanner;

public class Choclates {
	public static void main(String...args) {
		long sum=0,max=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test Cases : ");
		int tc=sc.nextInt();
		for(long i=0;i<tc;i++) {
			long c = sc.nextLong();
			long n = sc.nextLong();
			sum = n*(n+1)/2;
			
			if(c>sum) {
				System.out.println(((c-sum)%n));
				
			}
			else {
					System.out.println(c);
				}
			}
		}
}
