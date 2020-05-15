import java.util.ArrayList;
import java.util.Collections;

public class ContainsSearch {

	public static void main(String...args) {
		ArrayList <Integer> arr= new ArrayList<Integer>();
		arr.add(12);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		Collections.sort(arr);
		System.out.println(arr);
		System.out.println(arr.contains(2));
		boolean a=arr.contains(4);
		if(a)
			System.out.println(arr.indexOf(4));
		arr.removeAll(arr);
		System.out.println(arr);
		
	}
}
