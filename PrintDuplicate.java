import java.util.LinkedHashSet;

public class PrintDuplicate {
	public static void main(String...args) {
		String s="Deepak";
		int arr[]=new int[128];
		LinkedHashSet<Character>al= new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
			if(arr[s.charAt(i)]>1) {
				al.add(s.charAt(i));
			}
		}
		for(Character c:al) {
			System.out.print(c);
		}
	
	}
	

}
