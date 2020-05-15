import java.util.Arrays;

public class EvenOdd {
	public static void main(String...args) {
		int [] arr= {10,13,14,1,5};
		sort(arr);
	}

	static void sort(int[] arr) {
		int i=0,j=-1;
		while(i<arr.length) {
			if(arr[i]%2==0) {
				j+=1;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			i+=1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
