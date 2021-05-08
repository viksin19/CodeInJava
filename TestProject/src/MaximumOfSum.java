import java.util.Arrays;

/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
public class MaximumOfSum {

	static int compute(int num1,int num2) {
		return num1*num2 + (num1-num2);
	}
	static void maxOfSumOfProductandDiff(int[] arr,int size) {
		Arrays.sort(arr);
		//System.out.println("sorted array :: "+ arr);
		int max = compute(arr[size-1], arr[size-2]);
		
		max = Math.max(max, compute(arr[0],arr[1]));
		System.out.println("Maximum is :: "+max);
	}
	public static void main(String[] args) {
		int[] arr = {-6,1,7,6,0,5,-2,-5};
		
		maxOfSumOfProductandDiff(arr, arr.length);

	}

}
