import java.util.Scanner;

public class SeatingArrangment {
	public static void main(String...args) {
		System.out.println("Enter : ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();//rows
		int k=sc.nextInt();//capacity
		System.out.println("Enter : ");
		int arr[]=new int[n];
		int row[][]=new int[m][k];
		int dup[]=new int[m];
		int c=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				for(int a=0;a<k;a++) 
				{
					if(arr[i]>0 && arr[i]<m) {
						
					}
				}
				
			
			
		}
			}
		
		
		
		
	}

}
