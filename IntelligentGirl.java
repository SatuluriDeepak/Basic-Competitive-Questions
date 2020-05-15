import java.util.Scanner;

public class IntelligentGirl {
	public static void main(String...args) {
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	int n,c=0;
	char [] arr=s.toCharArray();
	
	for(int i=0;i<arr.length;i++) {
		n=Character.getNumericValue(arr[i]);
		if(n%2==0) {
			c++;
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(c+" ");
		n=Character.getNumericValue(arr[i]);
		if(n%2==0) {
			c--;
		}
	}
	}

}
