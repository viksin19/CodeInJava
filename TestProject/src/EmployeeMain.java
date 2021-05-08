
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author VikramSingh
 *
 */
class CycleInGraph {
	public int minSwap(int[] arr) {
		int minSwapResult = 0;

		int n = arr.length; // size of array
		TreeMap<Integer, Integer> sourceArr = new TreeMap<Integer, Integer>(); // tree map so that it will be sorted

		for (int i = 0; i < n; i++)
			sourceArr.put(arr[i], i);

		Boolean vis[] = new Boolean[n];
		Arrays.fill(vis, false); // All the nodes are not visited

		Set<Map.Entry<Integer, Integer>> entrySet = sourceArr.entrySet();
		@SuppressWarnings("unchecked")
		Map.Entry<Integer, Integer>[] entryArray = entrySet.toArray(new Map.Entry[entrySet.size()]);
		
		for (int k=0;k<n;k++) {
			if (vis[k] || entryArray[k].getValue() == k)
				continue;
			

			int cycCount = 0;
			int j = k;
			while (!vis[j]) {
				vis[j] = true;
				j = entryArray[j].getValue();
				cycCount++;
			}
			
			if (cycCount > 0)
				minSwapResult += cycCount - 1;  // adding cycle count 

		}
		return minSwapResult;

	}
}

public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started code.....");
		int arr[] = { 1, 5, 4, 3, 2 };
		CycleInGraph cg = new CycleInGraph();

		System.out.println(cg.minSwap(arr));

	}

}
