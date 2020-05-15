
class OddSubarray { 
	static int countSubarrays(int[] arr, 
			int n) { 
	 
		int difference = 0; 
		int ans = 0; 

	 
		int[] hash_positive = new int[n + 1]; 
		int[] hash_negative = new int[n + 1]; 
		hash_positive[0] = 1; 

		
		for (int i = 0; i < n; i++) { 
			
			if ((arr[i] & 1) == 1) { 
				difference++; 
			} else{ 
				difference--; 
			} 

	
			if (difference < 0) { 
				//System.out.println(-difference);
				//System.out.println(hash_negative[-difference]);
				ans += hash_negative[-difference]; 
				hash_negative[-difference]++; 
			}
			else { 
				ans += hash_positive[difference]; 
				hash_positive[difference]++; 
			} 
		} 
		return ans; 
	} 
	public static void main(String[] args) { 
		int[] arr = new int[]{3, 4, 6, 8, 
			1, 10, 5, 7}; 
		int n = arr.length; 

		System.out.println(countSubarrays(arr, n)); 
	} 
} 

