import java.util.Scanner;

public class OddSubarray {
	public static void main(String...args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Length : ");
			long n=sc.nextLong();
			long [] arr= new long[(int) n];
			for(long i=0;i<n;i++) 
				arr[(int) i]=sc.nextLong();			
			subarray(arr);
	}
	static void subarray(long[] arr) {
		long even = 0,odd = 0,c=0;
		for(long i=0;i<arr.length;i++) {
			for(long j=i;j<arr.length;j++) {
				for(long k=i;k<=j;k++) {
					System.out.print(arr[(int) k]+" ");
					{
						if(arr[(int)k]%2==0) 
							even+=1;
						else 
							odd+=1;	
					}
					if(even==odd){
						System.out.println();
						c+=1;
						even=0;
						odd=0;
					}	
				}
				System.out.println();
			}
		}
		System.out.println(c);
		
	}

}
