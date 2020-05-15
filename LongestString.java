import java.util.Arrays;

public class LongestString{

	public static void main(String[] args) {
		String s1="AGGTAB";
		String s2="GXTXAYB";

		int m=s1.length();
		int n=s2.length();
	
		
		LCS(s1,s2,m,n);

	}
	static void LCS(String x, String y, int m, int n) 
	{
		int L[][]=new int[m+1][n+1];
		for (int i=0;i<=m;i++) 
		{
			for(int j=0;j<=n;j++) 
			{
				if(i==0 || j==0) {
					L[i][j]=0;
				}
				else if(x.charAt(i-1)==y.charAt(j-1)){
					L[i][j]=L[i-1][j-1]+1;
				}
				else {
					L[i][j]=Math.max(L[i-1][j] , L[i][j-1]);
				}
			}
		}
		int index=L[m][n];
		int temp=index;
		char []seq=new char[index+1];
		seq[index]=' ';
		int i=m,j=n;
		
		while(i>0 && j>0) {
			if(x.charAt(i-1)==y.charAt(j-1)) {
				seq[index-1]=x.charAt(i-1);
				
				i--;
				j--;
				index--;
			}
			else if(L[i-1][j]>L[i][j-1])
				i--;
			else
				j--;
		}
		
		System.out.println("Length is : "+L[m][n]);
		for(int a=0;a<temp;a++) {
			System.out.print(seq[a]);
		}
		
	}
	
}
