/**
 * 
 */
package Array;
//Given an array arr[] and size of array is n and one another key x, and give you a segment size k. 

//The task is to find that the key x present in every segment of size k in arr[].

//Input : 
//arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
//x = 3 
//k = 3 
//Output : Yes 
//There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
//Input : 
//arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25} 
//x = 23 
//k = 5 
//Output :Yes 
//There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}. 
//23 is present all window.
//Input :arr[] = { 5, 8, 7, 12, 14, 3, 9} 
//x = 8 
//k = 2 
//Output : No

/**
 * @author VikramSingh
 *
 */
public class KeyInEverySegment {

	private static String isKeyPresent(int arr[], int x, int k) {
		int len = arr.length;
		int i = 0;
		boolean isPresent = false;
		while (i < len) {
			int j = i;
			int n = i + k;
			while (j < n && j < len) {
				if (arr[j] == x) {
					isPresent = true;
					break;
				}
				j++;
			}
			
			i += k;
			if (!isPresent)
				break;
			else if (i < len)
				isPresent = false;
		}
		if (isPresent)
			return "Yes";

		return "No";
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3 };
		int x = 3, k = 3;
		System.out.println(isKeyPresent(arr, x, k));

	}

}
