import java.util.Arrays;

public class EvenPosition {
	public static void main(String ...args) {
		int arr[]= {3, 6, 12, 1, 5, 8 };
		sort(arr,arr.length);
		
	}
	static void sort(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]%2==1) {
				if(i%2==0 && i!=n-1) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
